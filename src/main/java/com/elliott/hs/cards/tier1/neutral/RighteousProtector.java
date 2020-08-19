package com.elliott.hs.cards.tier1.neutral;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class RighteousProtector extends CardImpl {

    private RighteousProtector() {
        super("Righteous Protector", 1, 1, 1, Tribe.NEUTRAL);
    }

    public static RighteousProtector get() {
        return new RighteousProtector();
    }

}
