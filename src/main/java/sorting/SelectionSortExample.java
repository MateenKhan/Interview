package sorting;

public class SelectionSortExample {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest number index
				}
			}
			//moving smaller number index to the left part of array
			//and left part number index to the other side
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	private static void asdf(int[] input) {
		if (input.length == 0) {
			return;
		}
		for (int i = 0; i < input.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < input.length; j++) {
				if(input[j]<input[index]) {
					index=j;
				}
			}
			int temp = input[index];
			input[index]=input[i];
			input[i]=temp;
		}
	}

	public static void main(String a[]) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 1, 58, 22, 11 };
		System.out.println("Before Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		asdf(arr1);// sorting array using selection sort

		System.out.println("After Selection Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
