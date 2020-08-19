package com.elliott.hs.game;

import com.elliott.hs.cards.tier1.beast.AlleyCat;
import com.elliott.hs.cards.tier1.mech.MicroMachine;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void testTwoCardBoard() {
        Board board = new Board(List.of(AlleyCat.get(), MicroMachine.get()));
        assertEquals(2, board.getCards().size());
    }

}
