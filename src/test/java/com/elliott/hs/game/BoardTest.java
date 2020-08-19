package com.elliott.hs.game;

import com.elliott.hs.cards.AlleyCat;
import com.elliott.hs.cards.MicroMachine;
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
