package org.example.tower_defense.controller.menu;

import org.example.Game;
import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.controller.Controller;
import org.example.tower_defense.model.Menu.Menu;

import java.io.IOException;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedExit()) game.setState(null);
                /*if (getModel().isSelectedStart()) game.setState(new GameState(new LoaderArenaBuilder(1).createArena()));*/
                if(getModel().isSelectedDificulty())getModel().previousDifficulty();
        }
    }
}

