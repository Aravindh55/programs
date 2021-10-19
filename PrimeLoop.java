package Testing;

public class PrimeLoop {

	public static void main(String[] args) {
		int numbers = 100;
		int count;
		for (int i = 2; i <= numbers; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(" " + i);

			}

		}

	}
}
