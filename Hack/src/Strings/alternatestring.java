package Strings;

import java.util.Scanner;

public class alternatestring {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		String line = In.nextLine();
		int countA = 0, countB = 0, deletions = 0;
		char state = '\0';
		for (char i : line.toCharArray()) {
			if (i == 'A') {
				if ((state == '\0') || (state == 'B')) {
					state = 'A';
				} else {
					deletions++;
				}
			} else if (i == 'B') {
				if ((state == 'A') || (state == '\0')) {
					state = 'B';
				} else {
					deletions++;
				}
			}
		}

		System.out.println(deletions);

	}

}
