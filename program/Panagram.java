package program;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String inputSentence = scanner.nextLine().toLowerCase().replaceAll(" ", "");

	        boolean isPangram = checkPangram(inputSentence);

	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {

	  System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean checkPangram(String sentence) {
	        Set<Character> alphabetSet = new HashSet<>();

	        for (char c = 'a'; c <= 'z'; c++) {
	            alphabetSet.add(c);
	        }
			return false;
	    }
}

