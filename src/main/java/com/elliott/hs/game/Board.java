package com.elliott.hs.game;

import com.elliott.hs.model.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Board {

    private static final Logger logger = LoggerFactory.getLogger(Board.class);

    private List<Card> cards;
    private List<Card> initialCards;
    private int lastAttackIndex;

    public Board(List<Card> cards) {
        this.cards = cards;
        initialCards = new ArrayList<>();
        initialCards.addAll(this.cards);
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

    public void reset() {
        this.cards = this.initialCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;

        for(Card card: cards) {
            if(!board.cards.contains(card)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {

        int code = 13;

        for(Card card: cards){
            code = code * card.hashCode() * 13;
        }

        return code;
    }

    @Override
    public String toString() {
        return "Board{" +
                "cards=" + cards +
                '}';
    }
}
