package com.elliott.hs.game;

import com.elliott.hs.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Game {

    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    private List<Player> gameBoard;
    private int turn;
    private boolean battleFinished;

    public Game() {
        gameBoard = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        gameBoard.add(player);
    }

    public void play() {

        logger.info("Starting game");
        turn = 1;
        battleFinished = false;
        Player firstAttacker = determineFirstAttacker();

        playTurn(firstAttacker);

    }

    private boolean isBattleFinished() {
        for (Player player: gameBoard) {
            if(player.getBoard().getCards().size() == 0) {
                logger.info("Player " + player.getName() + " is DEAD");
                return true;
            }
        }

        return false;
    }

    private void playTurn(Player firstAttacker) {
        logger.info("Starting turn " + turn);

        //decide attacker
        firstAttacker.setAttacker(true);
        Player firstDefender = getNonAttacker();
        firstDefender.setAttacker(false);

        while(!isBattleFinished()) {

            logger.info("NEXT ATTACK");

            int attackIndex = determineAttackingCard(firstAttacker);
            Card attackingCard = firstAttacker.getBoard().getCards().get(attackIndex);

            logger.info("Attacker is " + attackingCard.getName());
            Card defendingCard = determineDefendingCard(firstDefender);
            logger.info("Defender is " + defendingCard.getName());

            Battle battle = Battle.BattleBuilder.getBuilder()
                    .attacker(attackingCard)
                    .defender(defendingCard)
                    .build();

            battle.fight();

            //remove dead cards
            firstAttacker.getBoard().removeDeadCards();
            firstDefender.getBoard().removeDeadCards();

            switchAttackerDefender(firstAttacker, firstDefender);

            firstAttacker.getBoard().setLastAttackIndex(attackIndex);

        }

    }

    private void switchAttackerDefender(Player firstAttacker, Player firstDefender) {
        firstAttacker.setAttacker(!firstAttacker.isAttacker());
        firstDefender.setAttacker(!firstDefender.isAttacker());
    }

    private Player getNonAttacker() {
        for(Player player: gameBoard) {
            if(!player.isAttacker()) {
                return player;
            }
        }
        throw new IllegalArgumentException("Could not find player");
    }

    private Player determineFirstAttacker() {
        logger.info("Determining first attacker..");
        Random random = new Random();
        int rand = random.nextInt(2);
        logger.info("Rolled a " + rand);
        logger.info("First player is " + gameBoard.get(rand).getName());
        return gameBoard.get(rand);
    }

    private int determineAttackingCard(Player attacker) {
        logger.info("Determining attacker..");

        int attackingCard = 0;

        //always far left on first turn
        if(turn == 1) {
            return 0;
        }

        int lastAttack = attacker.getBoard().getLastAttackIndex();

        if(attacker.getBoard().getCards().size() == 1) {
            //one card left, it attacks again
            attackingCard = 0;
        } else if(attacker.getBoard().getCards().size()-1 == lastAttack) {
            //attacker was far right, go far left
            attackingCard = 0;
        } else {
            //next on the right
            attackingCard = lastAttack+1;
        }

        return attackingCard;
    }

    private Card determineDefendingCard(Player defender) {
        logger.info("Determining defender..");
        Random random = new Random();
        int sizeOfDefendersBoard = defender.getBoard().getCards().size();
        int rand = random.nextInt(sizeOfDefendersBoard);
        logger.info("Size of Defenders board is " + sizeOfDefendersBoard);
        logger.info("Rolled a " + rand);
        return defender.getBoard().getCards().get(rand);
    }

    public List<Player> getGameBoard() {
        return gameBoard;
    }
}
