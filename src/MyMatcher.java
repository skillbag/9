import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMatcher {
    public static void main(String[] args) {

        String input = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile("\\b[Сс][а-я]+\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
            System.out.println(matcher.group());}


    }

