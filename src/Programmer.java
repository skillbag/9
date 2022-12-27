public class Programmer {
    public static void main(String[] args) {

    }
    String name, company, position;

    public Programmer(String name, String company){
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    String getPosition(){
        return position;
    }
    void work(){
        switch(position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "meddle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;

        }

    }
}

