package Miscelleneous;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {

		//DecimalFormat df = new DecimalFormat(".000");
		//BigInteger val = 0000087656543.98765;
		//System.out.println(df.format(val));

		Scanner In = new Scanner(System.in);
		int N = In.nextInt();
        BigInteger Sum = new BigInteger("0");
		for (int i = 0; i < N; i++) {
			BigInteger val = In.nextBigInteger();
			Sum=Sum.add(val);

		}
		System.out.println(Sum);

	}

}
