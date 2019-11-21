## classtest

abstract class CShape

{

	protected String color;
	
	public void setColor (String str)
	
	{
	
		color=str;
		
	}
	
	public abstract void show();
	
}

class CTriangle extends CShape

{

	protected double side1,side2,side3;
	
	public CTriangle (double a,double b,double c)
	
	{
	
		side1=a;
		
		side2=b;
		
		side3=c;
		
	}
	
	public void show()
	
	{
	
		System.out.print("color="+color+", ");
		
		System.out.println("area="+side1*side2*0.5);
		
	}
	
}

public class test

{

	public static void main(String args[])
	
	{
		CTriangle rect=new CTriangle (3,4,5);
		
		rect.setColor("red");
		
		rect.show();
		
	}
	
}
