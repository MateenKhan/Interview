package anonymous.classes;

//Java program to illustrate creating an immediate thread
//Using Anonymous Inner class that extends a Class

public class MyThread {

	public static void main(String[] args) {
		// Here we are using Anonymous Inner class
		// that extends a class i.e. Here a Thread class
		Thread t = new Thread() {
			public void run() {
				System.out.println("Child Thread");
			}
		};
		t.start();
		System.out.println("Main Thread");

		// Here we are using Anonymous Inner class
		// that implements a interface i.e. Here Runnable interface
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Child Thread2222222");
			}
		};
		Thread t2 = new Thread(r);
		t2.start();
		System.out.println("Main Thread22222222");

		// Here we are using Anonymous Inner class
		// that define inside argument, here constructor argument
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Child Thread3333333333");
			}
		});

		t3.start();

		System.out.println("Main Thread33333333");
	}
}
