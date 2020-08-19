package com.elliott.hs.game;

import com.elliott.hs.model.Card;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {

    @Test
    public void loadAllTierOneCards() {

        CardLoader loader = new CardLoader();
        Set<Card> cards = loader.getAllCards();
        assertEquals(16, cards.size());

    }
}
