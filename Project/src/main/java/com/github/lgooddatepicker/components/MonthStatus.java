package com.github.lgooddatepicker.components;

public enum MonthStatus {
    PREVIOUS(-1),
    CURRENT(0),
    NEXT(1);

    private final int value;

    MonthStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
