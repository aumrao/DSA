package multithreading;

import java.util.stream.IntStream;

public class SumOfNumberUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		

	}

}


class Worker1Parallel implements Runnable{

	public static int[]numbers=IntStream.rangeClosed(0, 5000).toArray();
	
	public int total=IntStream.rangeClosed(0,5000).sum();
	
	int array[];
	int sum=0;
	
	public Worker1Parallel(int []array) {
		this.array=array;
	}
	
	@Override
	public void run() {
	
		// TODO Auto-generated method stub
		  
	}
	
	
}

class Worker2Parallel implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}