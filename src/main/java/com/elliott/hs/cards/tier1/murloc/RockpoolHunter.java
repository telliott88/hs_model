package com.elliott.hs.cards.tier1.murloc;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class RockpoolHunter extends CardImpl {

    private RockpoolHunter() {
        super("Rockpool Hunter", 2, 3, 1, Tribe.MURLOC);
    }

    public static RockpoolHunter get() {
        return new RockpoolHunter();
    }

}
