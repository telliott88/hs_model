package com.elliott.hs.model;

import java.util.Objects;

public class CardImpl implements Card {

    private String name;
    private int attack;
    private int defense;
    private int initialDefense;
    private int level;
    private Tribe tribe;

    public CardImpl(String name, int attack, int defense, int level, Tribe tribe) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.initialDefense = defense;
        this.level = level;
        this.tribe = tribe;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String getName() {
        return name;
    }

    public void reset() {
        this.defense = this.initialDefense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardImpl card = (CardImpl) o;
        return Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + "(" + attack + "," + defense + ")";
    }
}
