package com.elliott.hs.cards.tier1.mech;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class MicroMachine extends CardImpl {

    private MicroMachine() {
        super("Micro Machine", 1, 2, 1, Tribe.MECH);
    }

    public static MicroMachine get() {
        return new MicroMachine();
    }

}
