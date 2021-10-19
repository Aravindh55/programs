package Testing;

import java.util.Iterator;

public class TrizzFrizz {

	public static void main(String[] args) {
		int numbers = 100;
		for (int i = 1; i < numbers; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("TrizzFrizz");

			} else if (i % 3 == 0) {
				System.out.println("trizz");

			} else if (i % 5 == 0) {
				System.out.println("frizz");

			} else {
				System.out.println(i);
			}

		}
	}

}
