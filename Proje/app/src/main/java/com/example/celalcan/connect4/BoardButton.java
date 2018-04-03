package com.example.celalcan.connect4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.Button;

/**
 * Created by Celal Can on 22.02.2018.
 */

public class BoardButton extends Button {
    int row;
    int column;
    public BoardButton(Context context, int r, int c) {
        super(context);
        Drawable d = AppCompatDrawableManager.get().getDrawable(context,R.drawable.board);
        setBackground(d);
        setStateListAnimator(null);
        row = r;
        column = c;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
}
