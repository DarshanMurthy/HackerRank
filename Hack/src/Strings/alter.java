package Strings;

import java.util.Scanner;

public class alter {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner In = new Scanner(System.in);
		int N = In.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Enter the sentence");
			String arr = In.nextLine();
			char[] charArray = arr.toCharArray();
			int deletion = 0;
			for (int j = 0; j < arr.length()-1; j++) {
				if (charArray[j] == charArray[j + 1]) {
					deletion++;
				}
			}
			System.out.println(deletion);

		}

	}

}
