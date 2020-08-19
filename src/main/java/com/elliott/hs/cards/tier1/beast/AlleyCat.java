package com.elliott.hs.cards.tier1.beast;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class AlleyCat extends CardImpl {

    private AlleyCat() {
        super("Alley Cat", 1, 1, 1, Tribe.BEAST);
    }

    public static AlleyCat get() {
        return new AlleyCat();
    }

}
