package com.aca.homework.week4.task2.point.impl;

import com.aca.homework.week4.task2.point.Point;

public final class ImmutablePoint implements Point {

    private final int pointX;
    private final int pointY;

    private ImmutablePoint(final int pointX, final int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public ImmutablePoint(final ImmutablePoint immutablePoint) {
        this.pointX = immutablePoint.getPointX();
        this.pointY = immutablePoint.getPointY();
    }

    public static ImmutablePoint getInstance(final int pointX, final int pointY) {
        return new ImmutablePoint(pointX, pointY);
    }


    @Override
    public int getPointX() {
        return this.pointX;
    }

    @Override
    public int getPointY() {
        return this.pointY;
    }

    public Point shiftLeft() {
        return new ImmutablePoint(this.getPointX() - 1, this.getPointY());
    }

    public Point shiftRight() {
        return new ImmutablePoint(this.getPointX() + 1, this.getPointY());
    }

    public Point shiftUp() {
        return new ImmutablePoint(this.getPointX(), this.getPointY() + 1);
    }

    public Point shiftDown() {
        return new ImmutablePoint(this.getPointX(), this.getPointY() - 1);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutablePoint)) {
            return false;
        }
        final ImmutablePoint other = (ImmutablePoint) obj;
        return this.getPointX() == other.getPointX() && this.getPointY() == other.getPointY();
    }


    @Override
    public String toString() {
        return "Immutable point with values:\n\t\t\t\t" +
                " X: " + this.getPointX() +
                "\n\t\t\t\t Y: " + this.getPointY();
    }
}
