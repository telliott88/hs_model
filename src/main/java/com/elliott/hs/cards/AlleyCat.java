package com.elliott.hs.cards;

import com.elliott.hs.model.CardImpl;

public class AlleyCat extends CardImpl {

    private AlleyCat() {
        super("Alley Cat", 1, 1, 1);
    }

    public static AlleyCat get() {
        return new AlleyCat();
    }

}
