package org.example.tower_defense.model.battlefield;



import org.example.tower_defense.model.Element.*;

import java.util.List;

public class BattleField {
    private final int width;
    private final int height;
    private int money;
    private List<Path> paths;
    private List<Turret> turrets;
    private List<Ballon> ballons;
    private int hp_base=100;
    private Placer placer;
    private List<Wall> walls;
    private Spawn spawn;
    private Flag flag;
    public BattleField(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPlacer(Placer placer) {
        this.placer = placer;
    }

    public Placer getPlacer() {
        return placer;
    }

    public Flag getFlag() {
        return flag;
    }

    public Spawn getSpawn() {
        return spawn;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public void setSpawn(Spawn spawn) {
        this.spawn = spawn;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public void setHp_base(int hp_base) {
        this.hp_base = hp_base;
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

    public boolean isEmpty_to_place_turret(Position position) {
        for (Path path: paths)
            if (path.getPosition().equals(position))
                return false;
        for (Turret turret: turrets)
            if (turret.getPosition().equals(position))
                return false;
        if(spawn.getPosition().equals(position))return false;
        if(flag.getPosition().equals(position))return false;
        return true;
    }
    public boolean isEmpty_to_move_placer(Position position) {
        for (Wall wall: walls)
            if (wall.getPosition().equals(position))
                return false;
        return true;
    }
    public boolean isEmpty_to_move_ballon(Position position) {
        for (Path path: paths)
            if (path.getPosition().equals(position))
                return true;
        return false;
    }

}
//CRIAR FUNCAO SE O BALAO ESTA NO RANGE DA TURRET

