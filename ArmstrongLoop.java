package Testing;

public class ArmstrongLoop {

	public static void main(String[] args) {
		int num = 200;
		for (int i = 0; i <= num; i++) {
			int number = i;
			int rem = 0;
			int sum = 0;
			while (number > 0) {
				rem = number % 10;

				sum = sum + (rem * rem * rem);
				number = number / 10;

			}
			if (i == sum) {
				System.out.print(" " + i);

			}

		}
	}

}
