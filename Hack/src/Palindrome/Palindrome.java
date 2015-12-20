package Palindrome;

public class Palindrome {

	public static void check(String args) {
		int N = args.length();
		

		for (int i = 0; i < N; i++) {
			if (args.charAt(i) != args.charAt(N - i - 1)) {
				System.out.println("False");

			}

		}

	}

	public static void main(String[] args) {
		System.out.println("PalilaP");

		check("Darsha");

	}

}
