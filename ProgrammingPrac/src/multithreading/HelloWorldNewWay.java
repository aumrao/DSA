package multithreading;

import java.util.concurrent.Callable;

public class HelloWorldNewWay {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HelloWorldInterface helloWorldInterface=()->{
			return "hello world";
		};
     
	    IncreBy5 by5=(x)-> 5+x;
	    
	    System.out.println("increment by 5 "+by5.increByFive(20));
	    
		System.out.println(helloWorldInterface.sayHello());
		
//		Runnable r=()->{
//			for(int i=0;i<100;i++) {
//				System.out.println(i);
//			}
//		};
//		new Thread(r).start();
		
		Callable c=()->{
			int sum=0;
			for(int i=0;i<100;i++) {
				sum=sum+i;
			}
			return sum;
		};
		System.out.println(c.call());
	}

}
