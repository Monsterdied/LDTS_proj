package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Turret;

public class TurretViewer implements ElementViewer<Turret> {
    @Override
    public void draw(Turret turret, GUI gui) {
        gui.drawTurret(turret.getPosition());
    }
}