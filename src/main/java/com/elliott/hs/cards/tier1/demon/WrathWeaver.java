package com.elliott.hs.cards.tier1.demon;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class WrathWeaver extends CardImpl {

    private WrathWeaver() {
        super("Wrath Weaver", 1, 1, 1, Tribe.DEMON);
    }

    public static WrathWeaver get() {
        return new WrathWeaver();
    }

}
