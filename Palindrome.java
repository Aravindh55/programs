package Testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Palindrome {
	public static void main(String[] args) {
		String text = "madam";
		boolean a = false;
		char[] charArray = text.toCharArray();
		List<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charList.add(charArray[i]);
		}
		Collections.sort(charList);
		for (int i = 0; i < charArray.length; i++) {
			if (charList.get(i) == charArray[i]) {
				a = true;
			} else {
				a = false;
			}
		}
		if (a == true) {
			System.out.println("palindrome");

		} else {
			System.out.println("not a palindrome");
		}

	}

}
