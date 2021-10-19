package Testing;

public class CheckPrime {

	public static void main(String[] args) {
		int number = 5;
		boolean a = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				a = false;

			} else {
				a = true;
			}

		}
		if (a==true) {
			System.out.println("not a prime");
			
		}else {
			System.out.println("prime");
		}
	}

}
