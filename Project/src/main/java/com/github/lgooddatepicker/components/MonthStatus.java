package com.github.lgooddatepicker.components;

/**
 * Month status indicates the type of month in displayed calendar.
 */
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
