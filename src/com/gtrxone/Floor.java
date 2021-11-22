package com.gtrxone;

public class Floor {
    private String MaterialTypes;
    private AreaOfFloor areaOfFloor;

    public Floor(String materialTypes, AreaOfFloor areaOfFloor) {
        MaterialTypes = materialTypes;
        this.areaOfFloor = areaOfFloor;
    }

    public String getMaterialTypes() {
        return MaterialTypes;
    }

    public AreaOfFloor getAreaOfFloor() {
        return areaOfFloor;
    }
}
