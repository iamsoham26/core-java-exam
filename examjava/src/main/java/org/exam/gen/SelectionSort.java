package org.exam.gen;

public class SelectionSort {

	static void selectionSort(int[] numbers){
		int i = 0;
		while(i < (numbers.length-1)){
			int index = i;
			int j;
			j = i+1;
			while(j < numbers.length){
				if(numbers[j]<numbers[index])
					index = j;
				j++;
			}
			int temp = numbers[i];
			numbers[i] = numbers[index];
			numbers[index] = temp;
			i++;
		}
		
		for(int x = 0; x < numbers.length; x++)
			System.out.print(numbers[x]+" ");
		System.out.println();
	}
	
}
