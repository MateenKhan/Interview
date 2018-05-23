/**
 * sum of cube of individucal digit should be the actual number
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  
 * @author MateenAhmed
 *
 */
public class Armstrong {
	
	public static void main(String[] args) {
		int num =153;
		int temp, lastDigit,result=0;
		temp=num;
		while(temp>0) {
			lastDigit = temp%10;
			temp = temp/10;
			result = result+(lastDigit*lastDigit*lastDigit);
		}
		if(result==num) {
			System.out.println("ARMSTRONG!!");
		} else {
			System.out.println("ILLE!!");
		}
	}

}
