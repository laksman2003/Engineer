package com.test.automation;

/**
 * Enum List the Days in week with field Value
 * Field Value gives the ordinal number of the Day
 */
public enum Days {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int value;

    private Days(int value) {
        this.value = value;
    }

   public int getValue() {
        return value;
    }

}
