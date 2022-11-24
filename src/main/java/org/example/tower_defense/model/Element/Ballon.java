package org.example.tower_defense.model.Element;

import org.example.tower_defense.model.Element.Element;



public class Ballon extends Element {
    private int hp;
    private BallonMovement direction;
    public Ballon(int hp, int x , int y){
        super(x,y);
        this.hp=hp;
        this.direction=BallonMovement.RIGHT;
    }

    public BallonMovement getDirection() {
        return direction;
    }

    public void setDirection(BallonMovement direction) {
        this.direction = direction;
    }

    public int getHp() {
        return hp;
    }

    public void get_damaged(int hp){
        /*-------------------*/this.hp -=hp ;
    }
}
