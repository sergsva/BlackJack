package test.blackjack;

import android.graphics.drawable.Drawable;

import java.util.HashMap;

/**
 * Created by Administrator on 05.09.2017.
 */

final class Card {
    private Drawable imageCard;
    private int valueDigit;
    private String cardSuit;
    private  Drawable imageShirt;
    private String cardType;
    public Card(String _cardType, String _cardSuit, Drawable _imageShirt)
    {
        cardType = _cardType;
        cardSuit =_cardSuit;
        imageShirt=_imageShirt;
        if (cardType == "Deuce")
        {
            valueDigit = 2;
        }
        if (cardType == "Triple")
        {
            valueDigit = 3;
        }
        if (cardType == "Four")
        {
            valueDigit = 4;
        }
        if (cardType == "Five")
        {
            valueDigit = 5;
        }
        if (cardType == "Six")
        {
            valueDigit = 6;
        }
        if (cardType == "Seven")
        {
            valueDigit = 7;
        }
        if (cardType == "Eight")
        {
            valueDigit = 8;
        }
        if (cardType == "Nine")
        {
            valueDigit = 9;
        }
        if (cardType == "Ten")
        {
            valueDigit = 10;
        }
        if (cardType == "Jack")
        {
            valueDigit = 10;
        }
        if (cardType == "Queen")
        {
            valueDigit = 10;
        }
        if (cardType == "King")
        {
            valueDigit = 10;
        }
        if (cardType == "Ace")
        {
            valueDigit = 11;
        }


    }
    public boolean IsCardAce()
    {
        if (cardType == "A") return true;
        return false;
    }

    public Drawable getImageCard() {
        return imageCard;
    }

    public Drawable getImageShirt() {
        return imageShirt;
    }

    public int getValueDigit() {
        return valueDigit;
    }
}
