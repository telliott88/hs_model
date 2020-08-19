package com.elliott.hs.cards.tier1.neutral;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class SelflessHero extends CardImpl {

    private SelflessHero() {
        super("Selfless Hero", 2, 1, 1, Tribe.NEUTRAL);
    }

    public static SelflessHero get() {
        return new SelflessHero();
    }

}
