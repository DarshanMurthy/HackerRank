package Strings;

public class test {
	// This method reverse the given string
	public static String fun() {
		String arr = "// TODO Auto-generated method stub";
		char[] ar = arr.toCharArray();
		char fi[] = new char[ar.length];
		int j = 0;
		for (int i = ar.length - 1; i >= 0; i--) {
			fi[j] = ar[i];
			System.out.print(fi[j]);
			j++;
		}
		return fi.toString();

	}

	// This method is to reverse string without extra space!
	public static void withoutExtraSpace() {
		String str = "//This method is to reverse string without extra space!";
		char[] arr = str.toCharArray();

		for (int i = 2; i < str.length() - 2; i++) {

			System.out.println(str.substring(1, i).toString());

		}

	}

	public static void main(String[] args) {

		// String str = fun();
		withoutExtraSpace();

	}

}
