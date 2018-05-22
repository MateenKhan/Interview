package sorting;

public class InsertionSort {
	public static void main(String a[]) {
		int[] arr1 = { 5,2,4,1,6,3 };
		System.out.println("intial");
		printArr(arr1);
		int[] arr2 = asdf(arr1);
		System.out.println("\nfinal");
		printArr(arr2);
	}
	
	public static int[] asdf(int[] input) {
		int temp;
		for(int i=1;i<input.length;i++) {
			for(int j=i;j>0;j--) {
				if(input[j]<input[j-1]) {
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		return input;
	}

	public static int[] doInsertionSort(int[] input) {

		int temp;
		for (int i = 1; i < input.length; i++) {//i=1,2,3
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {//j=1,2,3
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
			System.out.println();
			printArr(input);
		}
		return input;
	}
	
	private static void printArr(int inputArr[]) {
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(", ");
		}
	} 
}
