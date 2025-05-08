package aggregation;

public class Car   //class A
{
	Engine obj=new Engine();
	
	void stop()
	{
		obj.start();
		
		System.out.println("car stops");
	
	}
	
}