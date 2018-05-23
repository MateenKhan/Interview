/**
 * Addition of previous two numbers
 * @author MateenAhmed
 *
 */
public class Fibonaci {

	public static void main(String[] args) {
		int limit = 10;
		int n1 = 0, n2 = 1, n3;
		for (int i = 0; i < limit; i++) {
			if (i <= 1) {
				System.out.print(i+" ");
			}
			n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
	}
}
