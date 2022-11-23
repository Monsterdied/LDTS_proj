package org.example.tower_defense.model;

import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<String> entries;
    private int currentEntry = 0;
    private List<String> dificulty = Arrays.asList("Easy","Impoppable","Hard");
    private int currentDificulty = 0;

    public Menu() {
        this.entries = Arrays.asList("Start",dificulty.get(currentDificulty) ,"Exit");
    }

    public int getCurrentDificulty() {
        return currentDificulty;
    }

    public void nextEntry() {
        currentEntry++;
        if (currentEntry > this.entries.size() - 1)
            currentEntry = 0;
    }
    public void UpdateDificulty(){
        this.entries = Arrays.asList("Start",dificulty.get(currentDificulty) ,"Exit");
    }
    public void previousEntry() {
        currentEntry--;
        if (currentEntry < 0)
            currentEntry = this.entries.size() - 1;
        UpdateDificulty();
    }
    public void nextDifficulty() {
        currentDificulty++;
        if (currentDificulty > this.dificulty.size() )
            currentDificulty = 0;
        UpdateDificulty();
    }

    public void previousDifficulty() {
        currentDificulty--;
        if (currentDificulty < 0)
            currentDificulty = this.dificulty.size() - 1;
        UpdateDificulty();
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return currentEntry == i;
    }

    public boolean isSelectedExit() {
        return isSelected(2);
    }

    public boolean isSelectedDificulty() {
        return isSelected(1);
    }
    public boolean isSelectedStart() {
        return isSelected(0);
    }

    public int getNumberEntries() {
        return this.entries.size();
    }

}