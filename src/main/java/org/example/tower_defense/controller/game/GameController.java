package org.example.tower_defense.controller.game;

import org.example.tower_defense.model.battlefield.BattleField;
import org.example.tower_defense.controller.Controller;

public abstract class GameController extends Controller<BattleField> {
    public GameController(BattleField battlefield) {super(battlefield);}
}
