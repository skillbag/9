public class Balance {
    int r = 0, l = 0;

    void addRight(int n){
        r += n;
    }
    void addLeft(int n){
        l += 0;
    }
    String getSituation(){
         if(r == l) return "=";
         if (r > l) return "R";
        else return "L";

    }
}
