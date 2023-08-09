package multithreading;

public class SupervisorExampleWiothThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ParallelWorker1 parallelWorker1=new ParallelWorker1();
      ParallelWorker2 parallelWorker2=new ParallelWorker2();
      parallelWorker1.start();
      parallelWorker2.start();
	}

}

class ParallelWorker1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100);	
				System.out.println("The Worker1 is executing task: "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}
class ParallelWorker2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
				System.out.println("The Worker2 thread is executing task: "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}