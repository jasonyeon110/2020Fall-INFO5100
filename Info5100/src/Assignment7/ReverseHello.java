package Assignment7;

public class ReverseHello implements Runnable{
	
	int threadNum;
	
	public ReverseHello(int i){
		threadNum = i;
	}
	
	@Override
	public void run() {
		System.out.println("Hello from Thread " + threadNum);
	}
	
	public static void main(String[] args) {
		for (int i = 50; i > 0; i --) {
			Thread t = new Thread(new ReverseHello(i));
			t.start();
			try {
				t.join();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
