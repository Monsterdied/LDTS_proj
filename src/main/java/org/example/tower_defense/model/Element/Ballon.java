package org.example.tower_defense.model.Element;

import org.example.tower_defense.model.Element.Element;

public class Ballon extends Element {
    private int hp;
    public Ballon(int hp, int x , int y){
        super(x,y);
        this.hp=hp;
    }
    public void get_damaged(int hp){
        /*-------------------*/this.hp -=hp ;
    }
}
