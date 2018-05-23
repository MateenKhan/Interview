
public class DuplicateRemovalFromArr {
	
	public static void main(String[] args) {
		int[] arr1 = {10,20,50,30,10,40,50,20,90,120,120,20,90,21,21,123,121,123,121};
		sort(arr1);
		printArr(arr1);
		int uniqueArr[] = removeDuplicates(arr1);
		printArr(uniqueArr);
		
	}
	
	private static int[] removeDuplicates(int arr[]) {
		int result[] = new int[arr.length];
		int ctr=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				i++;
				result[ctr++] = arr[i];
				continue;
			}
			result[ctr++] = arr[i];
		}
		printArr(result);
		int finalResult[] = new int[ctr];
		for(int i=0;i<ctr;i++) {
			finalResult[i]=result[i];
		}
		return finalResult;
	} 
	
	private static void sort(int arr[]) {
		//selection sort
		int index;
		for(int i=0;i<arr.length-1;i++) {
			index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;//smallest number index
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}
	
	private static void printArr(int inputArr[]) {
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(", ");
		}
		System.out.println();
	} 

}
