package com.elliott.hs.game;

import com.elliott.hs.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Board {

    private static final Logger logger = LoggerFactory.getLogger(Board.class);

    private final List<Card> cards;
    private int lastAttackIndex;

    public Board(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getLastAttackIndex() {
        return lastAttackIndex;
    }

    public void setLastAttackIndex(int lastAttackIndex) {
        this.lastAttackIndex = lastAttackIndex;
    }

    public void removeDeadCards() {
        cards.removeIf(card -> card.getDefense() <= 0);
    }

    public void printBoard() {
        logger.info("Printing Board");
        for(Card card: cards) {
            logger.info(card.getName() + " ("+card.getAttack()+","+card.getDefense()+")");
        }
    }
}
