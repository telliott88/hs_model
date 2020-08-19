package com.elliott.hs.model;

public class CardImpl implements Card {

    private String name;
    private int attack;
    private int defense;
    private int level;

    public CardImpl(String name, int attack, int defense, int level) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
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
}
