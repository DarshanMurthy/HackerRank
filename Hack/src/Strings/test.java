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
		for (int i = 0; i < str.length(); i++) {
			str = str.substring(1, str.length() - i) + str.substring(0, 1)
					+ str.substring(str.length() - i, str.length());
			System.out.println(str);
		}
		System.out.println(str.toString());

	}

	public static void main(String[] args) {

		// String str = fun();
		withoutExtraSpace();

	}

}
