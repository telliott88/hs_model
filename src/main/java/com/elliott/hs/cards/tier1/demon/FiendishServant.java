package com.elliott.hs.cards.tier1.demon;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class FiendishServant extends CardImpl {

    private FiendishServant() {
        super("Fiendish Servant", 2, 1, 1, Tribe.DEMON);
    }

    public static FiendishServant get() {
        return new FiendishServant();
    }

}
