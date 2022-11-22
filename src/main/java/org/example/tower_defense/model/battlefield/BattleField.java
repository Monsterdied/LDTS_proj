package org.example.tower_defense.model.battlefield;



import org.example.tower_defense.model.Element.*;

import java.util.List;

public class BattleField {
    private int width;
    private final int height;

    private List<Path> paths;
    private List<Turret> turrets;
    private List<Ballon> ballons;
    private int hp_base=100;
    private Placer placer;
    public BattleField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setPlacer(Placer placer) {
        this.placer = placer;
    }

    public Placer getPlacer() {
        return placer;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<Path> getPaths() {
        return paths;
    }
    public List<Turret> getTurrets() {

        return turrets;
    }

    public int getHp_base() {
        return hp_base;
    }

    public List<Ballon> getBallons() {
        return ballons;
    }


    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }
    public void setBallons(List<Ballon> ballons) {
        this.ballons = ballons;
    }
    public void setTurrets(List<Turret> turrets) {
        this.turrets = turrets;
    }

    public boolean isEmpty(Position position) {
        for (Path path: paths)
            if (path.getPosition().equals(position))
                return false;
        for (Turret turret: turrets)
            if (turret.getPosition().equals(position))
                return false;
        return true;
    }}
//CRIAR FUNCAO SE O BALAO ESTA NO RANGE DA TURRET

