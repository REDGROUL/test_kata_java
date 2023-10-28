import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();




    }

    public static String calculate(String input) {

        String[] elems = input.split("[+\\-*/]");
        String num1 = elems[0].trim();
        String num2 = elems[1].trim();
        char operator = input.charAt(num1.length());
        int res = 0;
        if (operator == '+') {
            res = Integer.parseInt(num1) + Integer.parseInt(num2);
            return Integer.toString(res);
        }
        if (operator == '-') {
            res = Integer.parseInt(num1) - Integer.parseInt(num2);
            return Integer.toString(res);
        }
        if (operator == '*') {
            res = Integer.parseInt(num1) * Integer.parseInt(num2);
            return Integer.toString(res);
        }
        if (operator == '/') {
            res = Integer.parseInt(num1) / Integer.parseInt(num2);
            return Integer.toString(res);
        }
        throw new IllegalStateException("Unexpected value: " + operator);

    }




}