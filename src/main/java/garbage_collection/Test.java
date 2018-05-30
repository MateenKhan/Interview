package garbage_collection;

public class Test {
	//
	// static Test t;
	//
	// public static void main(String[] args) {
	// Test t1 = new Test();
	// t = new Test();
	// t = null;
	// System.gc();
	//
	// t = t1;
	// t1 = null;
	// System.gc();
	//
	// }
	//
	// @Override
	// protected void finalize() {
	// System.out.println("finalize method called");
	// }

//	public static void swap(Integer i, Integer j) {
//		Integer temp = new Integer(i);
//		i = j;
//		j = temp;
//	}
//
//	public static void main(String[] args) {
//		Integer i = new Integer(10);
//		Integer j = new Integer(20);
//		swap(i, j);
//		System.out.println("i = " + i + ", j = " + j);
//	}
	
	int a;
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.a=10;
		Test t2 = new Test();
		t2.a=100;
		swap(t1, t2);
		System.out.println(t1.a+ "  " +t2.a);
		swap(t1, t2, true);
		System.out.println(t1.a+ "  " +t2.a);
	}
	
	private static void swap(Test t1,Test t2) {
		Test temp = new Test();
		temp = t1;
		t1 = t2;
//		t1.a=999999999;
		t2 = temp;
	}
	
	private static void swap(Test t1,Test t2, boolean flag) {
		Test temp = new Test();
		temp.a = t1.a;
		t1.a = t2.a;
		t2.a = temp.a;
	}
}
