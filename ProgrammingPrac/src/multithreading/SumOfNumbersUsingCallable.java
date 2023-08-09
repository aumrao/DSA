package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
import java.io.Console;
import java.lang.*;


public class SumOfNumbersUsingCallable {
	public static int[] array=IntStream.rangeClosed(0, 5000).toArray();
	public static int total=IntStream.rangeClosed(0, 5000).sum();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		Callable callable1=()->{
			int sum=0;
			for(int i=0;i<array.length/2;i++) {
				sum+=array[i];
			}
			return sum;
		};
		Callable callable2=()->{
			int sum=0;
			for(int i=array.length/2;i<array.length;i++) {
			sum+=array[i];	
			}
			return sum;
		};
		
		ExecutorService exec=Executors.newFixedThreadPool(2);
		List<Callable<Integer>>taskList=Arrays.asList(callable1,callable2);
		List<Future<Integer>>result=exec.invokeAll(taskList);
		int sum=0;
		for(Future<Integer> f:result) {
			sum+=f.get();
			System.out.println("Sum of "+sum);
		}
		System.out.println("Sum of "+sum);
	}

}
