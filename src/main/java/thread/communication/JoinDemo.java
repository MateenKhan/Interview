package thread.communication;

public class JoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Helper h = new Helper();
		h.n=3;
		Thread t = new Thread(h);
		System.out.println("helper thread initiazlized");
		t.start();
		System.out.println("helper thread stared");
		t.join(2000);
		System.out.println("main completed");
		
	}

}

class Helper implements Runnable{
	int n;
	
	@Override
	public void run() {
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}