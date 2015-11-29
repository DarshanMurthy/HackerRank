package FibSeries;

import java.math.BigInteger;
import java.util.Scanner;

public class Fib {

	public static BigInteger fib(int N) {

		Scanner Input = new Scanner(System.in);
		int count = Input.nextInt();
		BigInteger first = new BigInteger(Input.nextLine());

		BigInteger Second = new BigInteger(Input.nextLine());

		BigInteger Third = first.add(Second);

		BigInteger fi = first.add(Second);

		return fi;

	}

	public static void main(String[] args) {
		int N = 100;
		System.out.print(fib(N));

	}

}
