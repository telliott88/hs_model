package com.elliott.hs.cards.tier1.beast;

import com.elliott.hs.model.CardImpl;
import com.elliott.hs.model.Tribe;

public class ScavengingHyena extends CardImpl {

    private ScavengingHyena() {
        super("Scavenging Hyena", 2, 2, 1, Tribe.BEAST);
    }

    public static ScavengingHyena get() {
        return new ScavengingHyena();
    }

}
