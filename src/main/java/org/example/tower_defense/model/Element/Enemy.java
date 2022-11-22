package org.example.tower_defense.model.Element;

public class Enemy extends Element {
    private int hp;
    public Enemy(int hp,int x , int y){
        super(x,y);
        this.hp=hp;
    }
    public void get_damaged(int hp){
        /*-------------------*/this.hp -= hp;
    }
    public int getHp() {
        return hp;
    }
}
