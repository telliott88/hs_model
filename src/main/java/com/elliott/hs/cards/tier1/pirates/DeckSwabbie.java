package com.elliott.hs.cards.tier1.pirates;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class DeckSwabbie extends CardImpl {

    private DeckSwabbie() {
        super("Deck Swabbie", 2, 2, 1, Tribe.PIRATE);
    }

    public static DeckSwabbie get() {
        return new DeckSwabbie();
    }

}
