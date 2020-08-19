package com.elliott.hs.cards.tier1.pirates;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class Scallywag extends CardImpl {

    private Scallywag() {
        super("Scallywag", 2, 1, 1, Tribe.PIRATE);
    }

    public static Scallywag get() {
        return new Scallywag();
    }

}
