/**
 * Jayaseelan
 */



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyString extends AbstractMyString {

	public MyString(String a) {
		theString = a;
	}

	public MyString() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString e = new MyString("Jayaseelan");

		// Test #1
		int expected1 = 5;
		// theString = "Jayaseelan";
		int result1 = e.getVowelsCount();
		if (expected1 == result1) {
			System.out.println("test passes");
		} else {
			System.out.println("test fails");
		}

		// Test #2
		int expected2 = 5;

		int result2 = e.getConsonantCount();
		if (expected2 == result2) {
			System.out.println("test passes");
		} else {
			System.out.println("test fails");
		}

		// Test #3
		int expected3 = 1;

		int result3 = e.getNumCapitalLetters();
		if (expected3 == result3) {
			System.out.println("test passes");
		} else {
			System.out.println("test fails");
		}

		// Test #4
		int expected4 = 10;

		int result4 = e.getLength();
		if (expected4 == result4) {
			System.out.println("test passes");
		} else {
			System.out.println("test fails");
		}

		// Test #4
		int expected5 = 381;

		int result5 = e.getSumOfAllCharacters();
		// System.out.println(result5);
		if (expected4 == result4) {
			System.out.println("test passes");
		} else {
			System.out.println("test fails");
		}

		// Test #5
		String expected6 = "naleesayaJ";

		String result6 = e.reverse();
		// System.out.println(result5);
		if (expected6.equals(result6)) {
			System.out.println("test passes");
		} else {
			System.out.println("test fails");
		}

	}

	@Override
	public int getVowelsCount() {
		char arr[] = theString.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
					|| (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')) {
				count++;
			}

		}
		return count;

	}

	@Override
	public int getConsonantCount() {
		// TODO Auto-generated method stub

//		char arr[] = theString.toCharArray();
//		int count1 = 0;
//		// if (theString.matches("[a-zA-z]")) {
//		for (int i = 0; i < arr.length; i++) {
//			Pattern p = Pattern.compile("a-zA-z");
//			Matcher matcher = p.matcher(theString);
//
//			if ((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
//					|| (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')) {
//
//			} else {
//				count1++;
//			}
//
//			// }
//
//		}
//		return count1;
		return theString.toLowerCase().replaceAll("a|e|i|o|u|\\s","").length();
	}

	@Override
	public int getNumCapitalLetters() {

		char c;
		int ct = 0;
		for (int i = 0; i < theString.length(); i++) {
			c = theString.charAt(i);
			if (c >= 65 && c <= 90) {
				ct++;

			}
		}

		return ct;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		int c = 0;
		for (char c1 : theString.toCharArray()) {
			c++;
		}
		return c;
	}

	@Override
	public int getSumOfAllCharacters() {
		// TODO Auto-generated method stub
		int sum1 = 0;
		char[] ch = theString.toCharArray();
		int temp_integer = 64;
		int temp_small = 96;

		for (char c : ch) {
			int temp = (int) c;
			// System.out.println(temp);

			if (temp <= 90 & temp >= 65) {
				int sum = (temp - temp_integer);
				// System.out.println(sum);
				sum1 = sum + sum1;

			} else if (temp <= 122 & temp >= 97) {

				int sum = (temp - temp_small);

				sum1 = sum + sum1;
			}
		}
		// System.out.println("the total is=" + sum1);

		return sum1;
	}

	@Override
	public String reverse() {
		// TODO Auto-generated method stub
		int len = theString.length();
		String s1 = "";
		for (int i = len - 1; i >= 0; i--) {
			s1 = s1 + theString.charAt(i);
		}
		// System.out.println(s1);

		return s1;
	}

}
