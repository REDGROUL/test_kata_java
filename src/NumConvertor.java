import java.util.HashMap;
import java.util.Map;

public class NumConvertor {

    private static final Map<Character, Integer> romanNumerals = new HashMap<>();

    static {
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
    }
    public static int RomanToArabic(String romanNumeral) {
        int result = 0;
        int previousValue = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanNumerals.get(romanNumeral.charAt(i));
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
                previousValue = currentValue;
            }
        }
        return result;
    }

    public static String ArabicToRoman(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : romanNumerals.entrySet()) {
            char romanDigit = entry.getKey();
            int arabicValue = entry.getValue();
            while (number >= arabicValue) {
                romanNumeral.append(romanDigit);
                number -= arabicValue;
            }
        }
        return romanNumeral.toString();
    }



}
