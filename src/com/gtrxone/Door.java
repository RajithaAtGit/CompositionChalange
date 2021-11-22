package com.gtrxone;

public class Door {
    private String type;
    private int width;
    private int height;
    private boolean isLock;

    public Door(String type, int width, int height, boolean isLock) {
        this.type = type;
        this.width = width;
        this.height = height;
        this.isLock = isLock;
    }

    public void lock() {
        System.out.println("Door->Door is locked");
        isLock = true;
    }

    public void unlock() {
        System.out.println("Door->Door is unlocked");
        isLock = false;
    }

    public String getType() {
        return type;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isLock() {
        return isLock;
    }
}
