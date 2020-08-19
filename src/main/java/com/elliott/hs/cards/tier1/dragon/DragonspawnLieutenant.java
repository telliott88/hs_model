package com.elliott.hs.cards.tier1.dragon;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class DragonspawnLieutenant extends CardImpl {

    private DragonspawnLieutenant() {
        super("Dragonspawn Lieutenant", 2, 3, 1, Tribe.DRAGON);
    }

    public static DragonspawnLieutenant get() {
        return new DragonspawnLieutenant();
    }

}
