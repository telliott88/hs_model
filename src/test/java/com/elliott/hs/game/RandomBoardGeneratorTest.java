package com.elliott.hs.game;

import com.elliott.hs.generator.RandomBoardGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomBoardGeneratorTest {

    @Test
    public void testRandomGeneration() {
        Board board = RandomBoardGenerator.generateRandomBoard();
        board.printBoard();
        assertEquals(7, board.getCards().size());
    }
}
