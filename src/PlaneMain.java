public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.flyStraight(50);
        plane.flyUp(80,90);
        plane.turnRight();
        plane.flyStraight(30);
        plane.dropBombs();
        plane.flyStraight(40);
        plane.flyDown(100,10);
        plane.fillFuel();
        plane.flyDown(100,10);
        plane.fillFuel();

    }
}
