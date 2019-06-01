package org.exam.gen;

public class FibbonacciNumber {

	long fibbonacciNum(long number){
		long[] fibbonacci = new long[(int) number];
		if(number < 0){
			return 0;
		}else{
			if(number == 1){
				return 1;
			}else{
				int i;
				fibbonacci[0] = fibbonacci[1] = 1;
				for(i = 2; i < fibbonacci.length; i++){
					fibbonacci[i] = fibbonacci[i-1] + fibbonacci[i-2];
				}
				return fibbonacci[i-1];
			}
		}
	}
	
}
