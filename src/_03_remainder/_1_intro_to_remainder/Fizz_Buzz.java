package _03_remainder._1_intro_to_remainder;

public class Fizz_Buzz {
	public static void main(String[] args) {

		for (int x = 1; x < 20; x++) {
			System.out.println(x);

			if (x % 3 == 0 && x % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (x % 3 == 0) {
				System.out.println("Fizz");

			}
			else if (x % 5 == 0) {
				System.out.println("Buzz");

			}
		}

	}
}
