package singleton;

public class Main {

	public static void main(String[] args){
		new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					BillPughSingleton obj = BillPughSingleton.getInstance();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+obj);
				}
			}
		}.start();
	}

}
