/**
 * Divisible by one and itself
 * 
 * @author MateenAhmed
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(527));
	}

	private static boolean isPrime(int number) {
		if (number < 0) {
			throw new RuntimeException("only positive input please!!");
		}
		if (number < 4) {
			return true;
		}
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

}
