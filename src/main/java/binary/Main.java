package binary;

public class Main {

	public static void main(String[] args) {
//		System.out.println(binarySearch(new int[]{1,2,3,4}, 2));
//		System.out.println(binarySearch(new int[]{1,2,32,41}, 2));
		System.out.println(binarySearch(new int[]{1,2,23,34}, 222));
	}
	
//	binary serch works only for sorted input 
	private static boolean binarySearch(int input[], int elem) {
		if (input.length == 0) {
			return false;
		}
		int low = 0;
		int high = input.length - 1;
		while (low <= high) {
			int middle = (low + high)/2;
			System.out.println("low:"+low);
			System.out.println("high:"+high);
			System.out.println("middle:"+middle);
			if(elem<input[middle]) {
				high = middle-1;
			} else if(elem>input[middle]) {
				low = middle+1;
			} else {
				return true;
			}
		}
		System.out.println("low:"+low);
		System.out.println("high:"+high);
//		System.out.println("middle:"+middle);
		return false;
	}

}
