package com.example.celalcan.connect4;

/**
 * Created by Celal Can on 22.02.2018.
 */

public class Cell {
    private int value;
    private int posx;
    private int posy;

    public Cell(){
        posx=0;
        posy=0;
        value=0;
    }
    public Cell(int v, int x, int y){
        value=v;
        posx=x;
        posy=y;
    }

    public int getX(){
        return posx;
    }

    public int getY(){
        return posy;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int x){
        value=x;
    }

    public void setX(int x){
        posx=x;
    }

    public void setY(int x){
        posy=x;
    }
}
