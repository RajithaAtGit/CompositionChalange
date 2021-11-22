package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        Floor floor = new Floor("Hardwood", new AreaOfFloor(50, 70));
        Door door = new Door("Slid", 7, 15, true);
        Room room = new Room(floor, new Windoor(10, 10), door);
        System.out.println("isDoorLock : "+ door.isLock());
        room.goToTheRoom();
        room.goOutFromRoom();


    }
}
