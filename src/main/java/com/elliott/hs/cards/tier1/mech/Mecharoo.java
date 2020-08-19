package com.elliott.hs.cards.tier1.mech;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class Mecharoo extends CardImpl {

    private Mecharoo() {
        super("Mecharoo", 1, 1, 1, Tribe.MECH);
    }

    public static Mecharoo get() {
        return new Mecharoo();
    }

}
