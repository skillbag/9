public class Plane {
    int x, y, z;
    int countBombs;
    int fuel;
    int dir;

    public Plane() {
        this.x = 100;
        this.y = 100;
        this.z = 100;
        this.fuel = 100;
        this.countBombs = 5;
    }

    public Plane(int x, int y, int z, int countBombs, int fuel) {
        this.z = z;
        this.x = x;
        this.y = y;
        this.countBombs = countBombs;
        this.fuel = fuel;
    }

    public void flyStraight(int i) {
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("что то не то");
        }
        this.fuel--;
        if(this.fuel <= 0 && this.z > 0){
            System.out.println("Кончилось топливо");
        } else{
            System.out.println("Вы пролетели прямо и сейчас находитесь на координатах х =" + this.x + "y=" + this.y + "z=" + this.z + "у вас осталось топлива=" + this.fuel);
        }

        }


    public void flyUp(int up, int i){

        this.z += up;
        if(this.fuel <= 0 && this.z > 0){
            System.out.println("Кончилось топливо");
        } else {
            System.out.println("вы поднялись  высь и находитесь на координатах="+"x" + this.x + "y" + this.y + "z" + this.z + "топлива осталось="+ this.fuel );
        }
    }
    public void flyDown(int down, int i){
        this.z -= down;
        if(this.z <= 0){
            System.out.println("вы приземлились");
        }else{
            System.out.println("вы опустились ниже и находитесь на координатах="+"x" + this.x + "y" + this.y + "z" + this.z + "топлива осталось="+ this.fuel);
        }
    }
    public void fillFuel(){
        if(this.z > 0){
            System.out.println("нельзя заправляться в воздухе");
        }else{
            this.fuel += 100;
            if(this.fuel > 100){
                this.fuel = 100;
            }
            System.out.println("вы заправились, сейчас топлива="+ this.fuel);
        }
    }
    public void dropBombs(){
        if(countBombs > 0){
            countBombs --;
            System.out.println("самолет сбросил бомбы по координатам="+ "x"+ this.x + "y"+ this.y+ "z"+ this.z + "колличество бомб осталось="+ this.countBombs);
        }else{
            System.out.println("нет бомб");
        }
    } public void turnLeft() {
        dir--;
        if(dir == -1){
            dir =3;
        }
        System.out.println("вы повернули налево");
    }
    public void turnRight(){
        dir++;
        if(dir == 4){
            dir = 0;
        }
        System.out.println("вы повернули направо");
    }
}
