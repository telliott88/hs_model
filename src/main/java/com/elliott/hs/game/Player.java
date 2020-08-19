package com.elliott.hs.game;

public class Player {

    private final String name;
    private Board board;
    private boolean isAttacker;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
        this.isAttacker = false;
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }

    public boolean isAttacker() {
        return isAttacker;
    }

    public void setAttacker(boolean attacker) {
        isAttacker = attacker;
    }
}
