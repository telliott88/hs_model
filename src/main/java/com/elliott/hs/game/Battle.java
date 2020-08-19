package com.elliott.hs.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.elliott.hs.model.Card;

public class Battle {

    private static final Logger logger = LoggerFactory.getLogger(Battle.class);
    private final Card attacker;
    private final Card defender;

    public Battle(BattleBuilder battleBuilder) {
        this.attacker = battleBuilder.attacker;
        this.defender = battleBuilder.defender;
    }

    public void fight() {

        logger.info(attacker.getName() + " attacks " + defender.getName());
        logBattleStatus();
        logger.info("-- RESULTS --");

        //update attacker
        int attackerDefense = attacker.getDefense();
        int defenderAttack = defender.getAttack();
        attacker.setDefense(attackerDefense-defenderAttack);

        //update defender
        int attackerAttack = attacker.getAttack();
        int defenderDefense = defender.getDefense();
        defender.setDefense(defenderDefense-attackerAttack);

        logBattleStatus();
    }

    private void logBattleStatus() {
        logger.info("Attacker: " + attacker.getName() + " (" + attacker.getAttack()
                + ", " + attacker.getDefense() + ")");

        logger.info("Defender: " + defender.getName() + " (" + defender.getAttack()
                + ", " + defender.getDefense() + ")");

        if(attacker.getDefense() <= 0) {
            logger.info("Attacker " + attacker.getName() + " died.");
        }

        if(defender.getDefense() <= 0) {
            logger.info("Defender " + defender.getName() + " died.");
        }
    }

    public Card getAttacker() {
        return attacker;
    }

    public Card getDefender() {
        return defender;
    }

    public static class BattleBuilder {

        private Card attacker;
        private Card defender;

        public static BattleBuilder getBuilder() {
            return new BattleBuilder();
        }

        private BattleBuilder() {
        }

        public BattleBuilder attacker(Card attacker) {
            this.attacker = attacker;
            return this;
        }

        public BattleBuilder defender(Card defender) {
            this.defender = defender;
            return this;
        }

        public Battle build() {
            return new Battle(this);
        }
    }
}