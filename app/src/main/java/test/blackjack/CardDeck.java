package test.blackjack;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 05.09.2017.
 */

final class CardDeck {
    private HashMap<Integer, String> CardType;
    private HashMap<Integer,String> CardSuit;
    private int countOfDeck;
    private ArrayList<Card> BigDeck;
    public CardDeck(int _countOfDeck, Drawable _imageShirt) {
        if (_countOfDeck < 0 || _countOfDeck > 6) countOfDeck = 4;
        else countOfDeck = _countOfDeck;

        CardType = new HashMap<Integer, String>();
        CardType.put(1, "Deuce");
        CardType.put(2, "Triple");
        CardType.put(3, "Four");
        CardType.put(4, "Five");
        CardType.put(5, "Six");
        CardType.put(6, "Seven");
        CardType.put(7, "Eight");
        CardType.put(8, "Nine");
        CardType.put(9, "Ten");
        CardType.put(10, "Jack");
        CardType.put(11, "Queen");
        CardType.put(12, "King");
        CardType.put(13, "Ace");

        CardSuit = new HashMap<Integer, String>();
        CardSuit.put(1, "Spades");
        CardSuit.put(2, "Hearts");
        CardSuit.put(3, "Diamonds");
        CardSuit.put(4, "Clubs");
        BigDeck = new ArrayList<>();

        for (int k = 0; k < countOfDeck; k++)
        {
            for (int i = 1; i < 5; i++)
            {
                for (int j = 1; j < 14; j++)
                {
                    BigDeck.add(new Card(CardType.get(j), CardSuit.get(i),_imageShirt));
                }
            }

        }
    }

    private void SnuffleCards()
    {
        Random rand = new Random();

        for (int i = 0; i < 10000; i++)
        {
            int temp = rand.nextInt(countOfDeck*52);
            Card Temp = BigDeck.get(0);
            BigDeck.set(0,BigDeck.get(temp));
            BigDeck.set(temp,Temp);
        }

    }

}
