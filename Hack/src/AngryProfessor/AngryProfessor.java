package AngryProfessor;

import java.math.BigInteger;
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		int N = In.nextInt();
		System.out.println("The number of inputs!");
		for (int i = 0; i < N; i++) {
			System.out.println("Enter the students count");
			int students = In.nextInt();
			int threshold = In.nextInt();
			int count = 0;
			int[] student = new int[students];
			for (int j = 0; j < students; j++) {
				student[j] = In.nextInt();
				if (student[j] >= 0) {
					count++;
				}
			}
			if (threshold >= count) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

}
