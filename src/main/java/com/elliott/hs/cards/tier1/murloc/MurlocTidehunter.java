package com.elliott.hs.cards.tier1.murloc;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class MurlocTidehunter extends CardImpl {

    private MurlocTidehunter() {
        super("Murloc Tidehunter", 1, 1, 1, Tribe.MURLOC);
    }

    public static MurlocTidehunter get() {
        return new MurlocTidehunter();
    }

}
