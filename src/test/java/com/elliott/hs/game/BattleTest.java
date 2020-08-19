package com.elliott.hs.game;

import com.elliott.hs.cards.AlleyCat;
import com.elliott.hs.cards.MicroMachine;
import com.elliott.hs.model.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleTest {

    @Test
    public void testSimpleCardBattle() {

        Battle battle = Battle.BattleBuilder.getBuilder()
                .attacker(AlleyCat.get())
                .defender(MicroMachine.get())
                .build();

        battle.fight();

        Card updatedCardOne = battle.getAttacker();
        Card updatedCardTwo = battle.getDefender();

        assertEquals(1, updatedCardOne.getAttack());
        assertEquals(1, updatedCardTwo.getAttack());
        assertEquals(0, updatedCardOne.getDefense());
        assertEquals(1, updatedCardTwo.getDefense());
    }

}
