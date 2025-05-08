package polymorphism;

public class PolyChild extends PolyParent 
{

	public static void main(String[] args) 
	{
		PolyChild obj=new PolyChild();
		obj.sum(8,4);
	}
	public void sun(int a,int b)
	{
			int c=a-b;
			System.out.println("Difference : "+c);
			super.sum(10,5);
	}

}


