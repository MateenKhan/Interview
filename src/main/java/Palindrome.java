
public class Palindrome {

	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n = 45454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
//			r=4
			sum = (sum * 10) + r;
//			sum=4
			n = n / 10;
//			n=454
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}
