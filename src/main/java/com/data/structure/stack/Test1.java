package com.data.structure.stack;

public class Test1 {

	public static void rotateElement(int[] arr, int k) {

		int lgg = arr.length;
		int token = lgg % k;
		
		// rotate element with no of spaces
		for (int i = 0; i < token; i++) {

			int end = arr[lgg - 1];

			//rotate 1 -1 time all element
			for (int p = lgg - 1; p > 0; p--) {
				
				arr[p] = arr[p-1];
  
			}
			
			
		}

	}

	public static void main(String[] ar) {
		
		

	}

}

//1 2 3 4 5 6 7 8 9 10
//10 1 2 3 4 5 6 7 8 9 


//8 9 10 1 2 3 4 5 6 7