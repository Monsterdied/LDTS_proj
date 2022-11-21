package tower_defense.states;
import tower_defense.GUI.GUI;
import tower_defense.Game;
import tower_defense.controler.Controller;
import tower_defense.viewer.Viewer;

import java.io.IOException;

public abstract class State<T> {
    private final T model;
    private final Controller<T> controller;
    private final Viewer<T> viewer;

    public State(T model) {
        this.model = model;
        this.viewer = getViewer();
        this.controller = getController();
    }

    protected abstract Viewer<T> getViewer();

    protected abstract Controller<T> getController();

    public T getModel() {
        return model;
    }

    public void step(Game game, GUI gui, long time) throws IOException {
        GUI.ACTION action = gui.getNextAction();
        controller.step(game, action, time);
        viewer.draw(gui);
    }
}