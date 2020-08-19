package com.elliott.hs.game;

import com.elliott.hs.cards.tier1.beast.AlleyCat;
import com.elliott.hs.cards.tier1.mech.MicroMachine;
import com.elliott.hs.generator.RandomBoardGenerator;
import com.elliott.hs.model.Card;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.elliott.hs.generator.RandomBoardGenerator.generateRandomBoard;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void testSimpleTwoCardGame() {
        Game game = new Game();

        List<Card> playerOneBoard = new ArrayList<>();
        playerOneBoard.add(AlleyCat.get());
        List<Card> playerTwoBoard = new ArrayList<>();
        playerTwoBoard.add(MicroMachine.get());

        game.addPlayer(new Player("Tom", new Board(playerOneBoard)));
        game.addPlayer(new Player("Max", new Board(playerTwoBoard)));

        game.play();

        assertEquals(0, game.getGameBoard().get(0).getBoard().getCards().size());
        assertEquals(1, game.getGameBoard().get(1).getBoard().getCards().size());
        assertEquals(1, game.getGameBoard().get(1).getBoard().getCards().get(0).getDefense());
        assertEquals(1, game.getGameBoard().get(1).getBoard().getCards().get(0).getAttack());
    }

    @Test
    public void testSimpleThreeCardGame() {
        Game game = new Game();

        List<Card> playerOneBoard = new ArrayList<>();
        playerOneBoard.add(AlleyCat.get());
        playerOneBoard.add(MicroMachine.get());
        List<Card> playerTwoBoard = new ArrayList<>();
        playerTwoBoard.add(MicroMachine.get());

        game.addPlayer(new Player("Tom", new Board(playerOneBoard)));
        game.addPlayer(new Player("Max", new Board(playerTwoBoard)));

        assertEquals(2, game.getGameBoard().get(0).getBoard().getCards().size());
        assertEquals(1, game.getGameBoard().get(1).getBoard().getCards().size());

        game.play();

        assertEquals(1, game.getGameBoard().get(0).getBoard().getCards().size());
        assertEquals(0, game.getGameBoard().get(1).getBoard().getCards().size());
        assertEquals(1, game.getGameBoard().get(0).getBoard().getCards().get(0).getDefense());
        assertEquals(1, game.getGameBoard().get(0).getBoard().getCards().get(0).getAttack());
    }

    @Test
    public void testFullBoardRandomised() {
        Game game = new Game();


        game.addPlayer(new Player("Tim", generateRandomBoard()));
        game.addPlayer(new Player("Mox", generateRandomBoard()));

        game.getGameBoard().get(0).getBoard().printBoard();
        game.getGameBoard().get(1).getBoard().printBoard();

        assertEquals(7, game.getGameBoard().get(0).getBoard().getCards().size());
        assertEquals(7, game.getGameBoard().get(1).getBoard().getCards().size());

        game.play();
    }
}
