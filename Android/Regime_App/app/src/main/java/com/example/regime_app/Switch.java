package com.example.regime_app;

import android.view.View;

public class Switch {
    private View button;
    private Integer pageNumber;

    public Switch(View button, Integer pageNumber) {
        this.button = button;
        this.pageNumber = pageNumber;
    }

    public View getButton() {
        return button;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }
}
