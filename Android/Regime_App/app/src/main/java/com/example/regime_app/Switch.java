package com.example.regime_app;

import android.view.View;

public class Switch {
    private View button;
    private Integer pageNumber;
    private Exec exec = null;
    private boolean readyToSwitch = false;

    public Switch(View button, Integer pageNumber, boolean readyToSwitch) {
        this.button = button;
        this.pageNumber = pageNumber;
        this.readyToSwitch = readyToSwitch;
    }

    public Switch(View button, Integer pageNumber) {
        this.button = button;
        this.pageNumber = pageNumber;
    }

    public void setExec(Exec exec) {
        this.exec = exec;
    }

    public boolean readyToSwitch() {
        return this.readyToSwitch;
    }

    public void setReadyToSwitch(boolean readyToSwitch) {
        this.readyToSwitch = readyToSwitch;
    }

    public View getButton() {
        return button;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Exec getExec() {
        return exec;
    }
}
