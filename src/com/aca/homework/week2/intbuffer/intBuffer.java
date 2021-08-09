package com.aca.homework.week2.intbuffer;

public class intBuffer {
    private Integer value;

    @Override
    public String toString() {
        return "value = " + this.getValue();
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
