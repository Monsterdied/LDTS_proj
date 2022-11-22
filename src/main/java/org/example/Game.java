package org.example;
import org.example.tower_defense.model.battlefield.BattleField;
import org.example.tower_defense.GUI.LanternaGUI;
import org.example.tower_defense.model.battlefield.BattlefieldBuilder;
import org.example.tower_defense.model.battlefield.LoaderBattlefieldBuilder;
import org.example.tower_defense.states.StateBattlefield;
import org.example.tower_defense.states.State;


import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;


public class Game {
    private final LanternaGUI gui;
    private State state;

    public Game() throws FontFormatException, IOException, URISyntaxException {
        this.gui = new LanternaGUI(20, 20);
        /*this.state = new State(new );*/
        this.state = new StateBattlefield(new LoaderBattlefieldBuilder(1).createBattleField());
    }

    public static void main(String[] args) throws IOException, FontFormatException, URISyntaxException {
        new Game().start();
    }

    public void setState(State state) {
        this.state = state;
    }

    private void start() throws IOException {
        int FPS = 10;
        int frameTime = 1000 / FPS;

        while (this.state != null) {
            long startTime = System.currentTimeMillis();

            state.step(this, gui, startTime);

            long elapsedTime = System.currentTimeMillis() - startTime;
            long sleepTime = frameTime - elapsedTime;

            try {
                if (sleepTime > 0) Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
            }
        }

        gui.close();
    }
}