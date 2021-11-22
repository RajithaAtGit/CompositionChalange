package com.gtrxone;

public class AreaOfFloor {
    private int width;
    private  int length;

    public AreaOfFloor(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int getArea(){
        return length*width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
