package org.exam.gen;

public class SQRT {

	static double sqrtNum(double number) {
		int[] between = new int[(int) number];
		double sqrtNumber = 0;
		if (number > 0) {
			for (int i = 1; i < between.length; i++) {
				between[i] = i * i;
				if (between[i] > number) {
					System.out.println("Square root of number is between " + (i - 1) + " and " + i);
					sqrtNumber = (i - 1);
					int x = 0;
					while(x < 5){
						double divide = number / sqrtNumber;
						sqrtNumber = (sqrtNumber + divide) / 2;
						x++;
					}
					break;
				}
			}
			return sqrtNumber;
		} else {
			return 0;
		}

	}

	static double mathSqrt(double number) {
		if (number >= 0)
			return Math.sqrt(number);
		else
			return 0;
	}

}
