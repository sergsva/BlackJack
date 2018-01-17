package test.blackjack;


import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

/**
 * Created by Administrator on 05.09.2017.
 */

final class Chip {
    private int valueDigit;
    private Drawable imageChip;
    public  Chip(ImageButton imageButton, int value)
    {
       imageChip = imageButton.getBackground();
        valueDigit  = value;
    }

    public int getvalueDigit() {
        return valueDigit ;
    }

    public Drawable getImageChip() {
        return imageChip;
    }
}
