package com.elliott.hs.cards.tier1.murloc;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class MurlocTidecaller extends CardImpl {

    private MurlocTidecaller() {
        super("Murloc Tidecaller", 1, 2, 1, Tribe.MURLOC);
    }

    public static MurlocTidecaller get() {
        return new MurlocTidecaller();
    }

}
