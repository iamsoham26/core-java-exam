package org.exam.gen;

public class ExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseNumber rn = new ReverseNumber();
		long i = rn.reverseNum(-78);
		System.out.println("Reverse Number "+i);
		
		FibbonacciNumber fn = new FibbonacciNumber();
		long j = fn.fibbonacciNum(6);
		System.out.println("Fibbonacci Number at this element "+j);
		
		int[] arr = {4,6,7,5,9};
		SelectionSort.selectionSort(arr);
		
		double d = SQRT.sqrtNum(41);
		System.out.println("Square root of this number: "+d);
		
		double s = SQRT.mathSqrt(41);
		System.out.println("Math.sqrt of this number: "+s);
		
		int x = GCD.euclideanGCD(13, 26);
		System.out.println("GCD between these two is: "+x);
	}  
}
