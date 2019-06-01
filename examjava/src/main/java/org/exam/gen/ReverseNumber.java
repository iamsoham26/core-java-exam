package org.exam.gen;

public class ReverseNumber {

	public long reverseNum(long number) {

		long rev;
		long sum = 0;
		
		if(number < 10 && number >= 0){
			return number;
		}else{
			if(number < 0){
				number = (-number);
				while((number) > 0){
					rev = ((number) % 10);
					sum = ((sum * 10) + rev);
					number = (number) / 10;
				}
				return -sum;
			}else{
				while((number) > 0){
					rev = ((number) % 10);
					sum = ((sum * 10) + rev);
					number = (number) / 10;
				}
				return sum;
			}
		}
	}
}
