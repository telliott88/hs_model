package com.elliott.hs.game;

import com.elliott.hs.model.Card;

import java.util.List;

public class Board {

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
}
