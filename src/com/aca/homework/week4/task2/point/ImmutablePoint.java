package com.aca.homework.week4.task2.point;

public final class ImmutablePoint implements Point {

    private final int pointX;
    private final int pointY;

    private ImmutablePoint(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    public ImmutablePoint(ImmutablePoint immutablePoint){
        this.pointX = immutablePoint.pointX;
        this.pointY = immutablePoint.pointY;
    }

    @Override
    public int getX() {
        return this.pointX;
    }

    @Override
    public int getY() {
        return this.pointY;
    }

    public Point shiftLeft() {
        return new ImmutablePoint(this.pointX - 1, this.pointY);
    }

    public Point shiftRight() {
        return new ImmutablePoint(this.pointX + 1, this.pointY);
    }
    public Point shiftUp(){
        return new ImmutablePoint(this.pointX, this.pointY + 1);
    }
    public Point shiftDown(){
        return new ImmutablePoint(this.pointX, this.pointY - 1);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ImmutablePoint)){
            return false;
        }
        ImmutablePoint other = (ImmutablePoint) obj;
        return this.pointX == other.pointX && this.pointY == other.pointY;
    }


    @Override
    public String toString() {
        return "Immutable point with values: \n" +
                "\tX = " + this.pointX +
                "\n\tY = " + this.pointY;
    }
}
