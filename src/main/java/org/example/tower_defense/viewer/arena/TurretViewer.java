package org.example.tower_defense.viewer.arena;

import org.example.tower_defense.Element.Turret;
import org.example.tower_defense.GUI.GUI;

public class TurretViewer implements ElementViewer<Turret> {
    @Override
    public void draw(Turret turret, GUI gui) {
        gui.drawTurret(turret.getPosition());
    }
}
