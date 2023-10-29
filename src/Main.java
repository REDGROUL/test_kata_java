import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(calculate(input));




    }

    public static String calculate(String input) {

        String[] elems = input.split("[+\\-*/]");

        String num1 = elems[0].trim();
        String num2 = elems[1].trim();

        int number1, number2;

        try{
            number1 = Integer.parseInt(num1);
            number2 = Integer.parseInt(num2);
        }catch (Exception e)
        {
            number1 = NumConvertor.RomanToArabic(num1);
            number2 = NumConvertor.RomanToArabic(num2);
        }

        char operator = input.charAt(num1.length());
        int res;
        if (operator == '+') {
            res = number1 + number2;
            return Integer.toString(res);
        }
        if (operator == '-') {
            res = number1 - number2;
            return Integer.toString(res);
        }
        if (operator == '*') {
            res = number1 * number2;
            return Integer.toString(res);
        }
        if (operator == '/') {
            res = number1 / number2;
            return Integer.toString(res);
        }

        throw new IllegalStateException("Unexpected value: " + operator);

    }
}