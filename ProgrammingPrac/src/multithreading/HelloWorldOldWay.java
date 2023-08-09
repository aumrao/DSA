package multithreading;

public class HelloWorldOldWay implements HelloWorldInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	     HelloWorldInterface helloWorldInterface=new HelloWorldOldWay();
	     System.out.println(helloWorldInterface.sayHello());
		
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello World";
	}
 
}
