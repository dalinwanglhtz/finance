package com.codewardev;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Finance {

	public static BigInteger finance(int n) {
		long total = 0;
		int tmp = n+1;
		for(int i=0; i<=n*2; i+=2) {
			total += IntStream.range(i, tmp++).sum();
		}
		return BigInteger.valueOf(total);
	}

}
