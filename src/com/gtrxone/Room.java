package com.gtrxone;

public class Room {
    private Floor floor;
    private Windoor windoor;
    private Door door;


    public Room(Floor floor, Windoor windoor, Door door) {
        this.floor = floor;
        this.windoor = windoor;
        this.door = door;
    }
    public void goToTheRoom(){
        System.out.println("Room->goToTheRoom()");
        door.unlock();
    }
    public void goOutFromRoom(){
        System.out.println("Room->goOutFromRoom()");
        door.lock();
    }
}
