package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private double power;

    private long nextSerial = 0;
    private final long serial = 2L;


    public LethalWeapon (){
    }

    public LethalWeapon (String color, Double power, int roundsLeft) {
        this.color = color;
        this.power = power;
        this.roundsLeft = roundsLeft;
    }

    public void setPower (double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void reload (int rounds) {
        roundsLeft += rounds;
    }

    public void pewPew () {
        roundsLeft -= 2;
    }

    public long getSerial() {
        return serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LethalWeapon that = (LethalWeapon) o;
        return roundsLeft == that.roundsLeft &&
                Double.compare(that.power, power) == 0 &&
                color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, roundsLeft, power);
    }
}
