package program;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
	  public static void main(String[] args) {
	        Map<Character, Integer> romanNumerals = new HashMap<>();
	        romanNumerals.put('I', 1);
	        romanNumerals.put('V', 5);
	        romanNumerals.put('X', 10);
	        romanNumerals.put('L', 50);
	        romanNumerals.put('C', 100);
	        romanNumerals.put('D', 500);
	        romanNumerals.put('M', 1000);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine().toUpperCase();

	        int result = 0;
	        int prevValue = 0;

	        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
	            int value = romanNumerals.get(romanNumeral.charAt(i));
	            if (value < prevValue) {
	                result -= value;
	            } else {
	                result += value;
	            }
	            prevValue = value;
	        }

	        System.out.println("Integer value: " + result);
	    }
	}


