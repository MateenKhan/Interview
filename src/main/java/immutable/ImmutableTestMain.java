package immutable;

import java.util.Date;

public class ImmutableTestMain {

	public static void main(String[] args) {
		ImmutableClassExample ic = ImmutableClassExample.getImmutableClassExampleObject("Java", 1, new Date());
		System.out.println(ic);
		ImmutableTestMain.changeValues(ic.getVal1(), ic.getVal2(), ic.getDate());
		System.out.println(ic);
	}

	public static void changeValues(String val1, Integer val2, Date d) {
		val1 = "interview";
		val2 = 100;
		d.setDate(10);
	}

}

final class ImmutableClassExample {
	// Both String and Integer is Immutable
	private final String val1;
	private final Integer val2;

	// Date is a Mutable field
	private final Date date1;

	private ImmutableClassExample(String val1, Integer val2, Date date1) {
		this.val1 = val1;
		this.val2 = val2;
		this.date1 = new Date(date1.getTime());
	}

	public String getVal1() {
		return val1;
	}

	public Integer getVal2() {
		return val2;
	}

	public Date getDate() {
		return new Date(date1.getTime());
	}

	public static ImmutableClassExample getImmutableClassExampleObject(String a, Integer b, Date c) {
		return new ImmutableClassExample(a, b, c);
	}

	public String toString() {
		return val1 + " --- " + val2 + " --- " + date1;
	}
}
