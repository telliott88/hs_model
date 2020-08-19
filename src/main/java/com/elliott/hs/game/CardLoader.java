package com.elliott.hs.game;

import com.elliott.hs.cards.tier1.beast.AlleyCat;
import com.elliott.hs.cards.tier1.beast.ScavengingHyena;
import com.elliott.hs.cards.tier1.demon.FiendishServant;
import com.elliott.hs.cards.tier1.demon.VulgarHomunculus;
import com.elliott.hs.cards.tier1.demon.WrathWeaver;
import com.elliott.hs.cards.tier1.dragon.DragonspawnLieutenant;
import com.elliott.hs.cards.tier1.dragon.RedWhelp;
import com.elliott.hs.cards.tier1.mech.Mecharoo;
import com.elliott.hs.cards.tier1.mech.MicroMachine;
import com.elliott.hs.cards.tier1.murloc.MurlocTidecaller;
import com.elliott.hs.cards.tier1.murloc.MurlocTidehunter;
import com.elliott.hs.cards.tier1.murloc.RockpoolHunter;
import com.elliott.hs.cards.tier1.neutral.RighteousProtector;
import com.elliott.hs.cards.tier1.neutral.SelflessHero;
import com.elliott.hs.cards.tier1.pirates.DeckSwabbie;
import com.elliott.hs.cards.tier1.pirates.Scallywag;
import com.elliott.hs.model.Card;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CardLoader {

    private Set<Card> cards;

    public CardLoader() {
        cards = new HashSet<>();
        load();
    }

    public Set<Card> getAllCards() {
        return cards;
    }

    public Card getRandomCard() {
        Card[] cardArray = cards.toArray(new Card[16]);

        Random random = new Random();
        int rand = random.nextInt(cardArray.length);

        return cardArray[rand];

    }

    private void load() {

        cards.add(AlleyCat.get());
        cards.add(ScavengingHyena.get());
        cards.add(FiendishServant.get());
        cards.add(VulgarHomunculus.get());
        cards.add(WrathWeaver.get());

        cards.add(DragonspawnLieutenant.get());
        cards.add(RedWhelp.get());
        cards.add(Mecharoo.get());
        cards.add(MicroMachine.get());

        cards.add(MurlocTidecaller.get());
        cards.add(MurlocTidehunter.get());
        cards.add(RockpoolHunter.get());

        cards.add(RighteousProtector.get());
        cards.add(SelflessHero.get());
        cards.add(DeckSwabbie.get());
        cards.add(Scallywag.get());
    }
}
