package org.exam.gen;

public class GCD {

	static int euclideanGCD(int num1, int num2) {

		if (num1 == 0) {
			return num2;
		} else if (num2 == 0) {
			return num1;
		} else if (num1 == num2) {
			return num1;
		} else if (num1 > num2) {
			return euclideanGCD(num1 - num2, num2);
		} else {
			return euclideanGCD(num1, num2 - num1);
		}
	}

}
