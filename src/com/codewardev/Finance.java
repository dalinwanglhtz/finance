package com.codewardev;

// https://www.codewars.com/kata/559ce00b70041bc7b600013d/train/java

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Finance {

	public static BigInteger finance(int n) {
		long total = 0;
		int tmp = n+1, i=0;
		do {
			total += IntStream.range(i, tmp++).sum();
			i+=2;
		} while(i!=tmp);
		
		return BigInteger.valueOf(total);
	}

}
