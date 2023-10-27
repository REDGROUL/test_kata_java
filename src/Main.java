import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();



      String s = calculate(input);
        System.out.println(s);






    }

    public static String calculate(String input) {
        String regex = "(\\d+)\\s*([+\\-*/])\\s*(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {

            String operator = matcher.group(2);

            int first = Integer.parseInt(matcher.group(1));
            int second = Integer.parseInt(matcher.group(3));
            int res = 0;
            switch (operator)
            {
                case "+":
                    res = first+second;
                    break;
                case "-":
                    res = first-second;
                    break;
                case "/":
                    res = first/second;
                    break;
                case "*":
                    res = first*second;
                    break;

            }

            return Integer.toString(res);

        }

        throw new IllegalArgumentException("Invalid input format");
    }




}