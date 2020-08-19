package com.elliott.hs.cards;

import com.elliott.hs.model.CardImpl;

public class MicroMachine extends CardImpl {

    private MicroMachine() {
        super("Micro Machine", 1, 2, 1);
    }

    public static MicroMachine get() {
        return new MicroMachine();
    }

}
