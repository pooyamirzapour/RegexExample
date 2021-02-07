import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "This is a book. a book.";

        Pattern pattern = Pattern.compile("[as]");
        Matcher matcher=pattern.matcher(str);

        while (matcher.find()){
            System.out.println(String.format("%d %d %s", matcher.start(), matcher.end(),
                    str.substring(matcher.start(), matcher.end())));
        }
    }
}
