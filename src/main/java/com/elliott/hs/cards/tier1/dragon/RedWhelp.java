package com.elliott.hs.cards.tier1.dragon;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class RedWhelp extends CardImpl {

    private RedWhelp() {
        super("Red Whelp", 1, 2, 1, Tribe.DRAGON);
    }

    public static RedWhelp get() {
        return new RedWhelp();
    }

}
