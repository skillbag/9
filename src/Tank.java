public class Tank {
    int x;
    int y;
    int dir;

    public void goForward(int i) {
        x += i;
        if(dir == 0) x += i;
        else if(dir == 1) y += i;
        else if(dir == 2) x -= i;
        else y -= i;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", "+ y +" now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 2;
    }
    public void turnRight() {
        dir++;
        if (dir == 4) dir = 1;
    }

    public void goBackward(int i) {
        goForward(-i);

    }
}