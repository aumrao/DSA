package multithreading;

public class SupervisorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker1 worker1=new Worker1();
		Worker2 worker2=new Worker2();
		try {
			worker1.executeWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			worker2.executeWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

class Worker1{
	public void executeWork() throws InterruptedException {
		for(int i=0;i<10;i++) {
			Thread.sleep(100);
			System.out.println("Worker1 is executing task :"+i);
		}
	}
}

class Worker2{
	public void executeWork() throws InterruptedException {
		for(int i=0;i<10;i++) {
			Thread.sleep(100);
			System.out.println("Worker2 is executing task");
		}
	}
	
}