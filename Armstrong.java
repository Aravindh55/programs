package Testing;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int rem;
		int sum = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + (rem * rem * rem);

		}
		if (temp == sum) {
			System.out.println("it is a armsstrong number");

		} else {
			System.out.println("it is not a armstrong number");
		}
	}

}
