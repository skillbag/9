public class Str {
    public static void main(String[] args) {
        System.out.println(removeW("А роза упала на руку Арзону"));
    }
    private static String removeW(String str){
        return str.replaceAll("", "");
    }
}
