import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class TextCleaner {
    public static void main(String[] args) {
        String test = "<strike>Это удалить!</strike>А это хороший текст<strike>Это тоже удаляем</strike>";
        Pattern pattern = compile("<strike>.+?</strike>");
        Matcher matcher = pattern.matcher(test);
        while(matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("found match\n" + test.substring(start, end) + "\nfrom" + start + "to" + (end - 1));
        }

        System.out.println("clean text");
        System.out.println(matcher.replaceAll(""));

    }
}
