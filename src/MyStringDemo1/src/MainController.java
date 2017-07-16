import java.util.Scanner;

public class MainController {
	public static void main(String args[]) {
		// TODO: Test code goes here
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a String");
		String theString = ss.nextLine();
		MyString e1 = new MyString(theString);
		int vowelsCount = e1.getVowelsCount();
		int consonantsCount = e1.getConsonantCount();
		int numbserOfCapitalLetters = e1.getNumCapitalLetters();
		int stringLength = e1.getLength();
		int sumOfAllLetters = e1.getSumOfAllCharacters();
		String reverse = e1.reverse();

		System.out.println("the number of vowels count is=" + vowelsCount);
		System.out.println("the number of consonants count is=" + consonantsCount);
		System.out.println("Numberof capital letters in word=" + numbserOfCapitalLetters);
		System.out.println("the given string length is=" + stringLength);
		System.out.println("sum of all letter in albhabetic order=" + sumOfAllLetters);
		System.out.println("the reverse string string is=" + reverse);

	}
}