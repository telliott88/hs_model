package com.elliott.hs.cards.tier1.demon;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class VulgarHomunculus extends CardImpl {

    private VulgarHomunculus() {
        super("Vulgar Homunculus", 2, 4, 1, Tribe.DEMON);
    }

    public static VulgarHomunculus get() {
        return new VulgarHomunculus();
    }

}
