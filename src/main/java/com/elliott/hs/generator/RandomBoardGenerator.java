package com.elliott.hs.generator;

import com.elliott.hs.game.Board;
import com.elliott.hs.game.CardLoader;
import com.elliott.hs.model.Card;

import java.util.ArrayList;
import java.util.List;

public class RandomBoardGenerator {

    public static Board generateRandomBoard() {

        CardLoader loader = new CardLoader();
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            cards.add(loader.getRandomCard());
        }

        return new Board(cards);
    }

}
