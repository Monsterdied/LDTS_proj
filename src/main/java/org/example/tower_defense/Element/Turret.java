package org.example.tower_defense.Element;
public class Turret extends Element {
    private int range;
    private long time;
    private long cooldown;
    public Turret(int cooldown,int range,int x, int y) {
        super(x, y);
        this.range = range;
        time = 0;
        this.cooldown=cooldown;
    }

    public int getRange() {
        return range;
    }
}
