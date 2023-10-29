import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(calculate(input));

    }

    public static String calculate(String input) {
        input = input.replaceAll(" ", "");
        String[] elems = input.split("[+\\-*/]");

        String num1 = elems[0].trim();
        String num2 = elems[1].trim();

        if(elems.length > 2)
        {
            throw new IllegalStateException("Калькулятор поддерживает операции только с 2 цифрами");
        }

        int number1, number2;
        boolean isRoman = false;

        /*
        Проверяем является ли число арабским при конвертации из строки в число
         */
        try{

            number1 = Integer.parseInt(num1);
            number2 = Integer.parseInt(num2);


        }catch (Exception e) // отлавливаем исключение конвертации и конвертируем из римского числа в арабское
        {
            number1 = NumConvertor.RomanToArabic(num1);
            number2 = NumConvertor.RomanToArabic(num2);
            isRoman = true;
        }



        if(number1 > 10 || number2 > 10)
        {
            throw new IllegalStateException("Ошибка ввода, число не должно быть больше 10" );
        }

        char operator = input.charAt(num1.length());
        int res = 0;


        if (operator == '+')
        {
            res = number1 + number2;

            if(isRoman)
            {
               return NumConvertor.ArabicToRoman(res);
            }
            else{
                return Integer.toString(res);
            }

        }


        if (operator == '-') {
            res = number1 - number2;
            if(isRoman && res < 0)
            {
                throw new IllegalStateException("в римской системе нет отрицательных чисел");
            }else
            {
                if(isRoman)
                {
                    return NumConvertor.ArabicToRoman(res);

                }else
                {
                    return Integer.toString(res);
                }
            }

        }

        if (operator == '*') {
            res = number1 * number2;

            if(isRoman)
            {
                return NumConvertor.ArabicToRoman(res);
            }
            else{
                return Integer.toString(res);
            }

        }

        if (operator == '/') {
            res = number1 / number2;
           // return Integer.toString(res);

            if(isRoman)
            {
                return NumConvertor.ArabicToRoman(res);
            }
            else{
                return Integer.toString(res);
            }
        }



        throw new IllegalStateException("Неизвестный оператор: " + operator);

    }
}