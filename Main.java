interface Shape
{
  abstract void getArea();
}
class Rectangle implements Shape
{
  double length;
  double width;
  
public Rectangle(double l,double w)
{
  length=l;
  width=w;
}
public void getArea()
{
  System.out.println(("Rectangle_area="+length*width).toString());
  
}
}
class Triangle implements Shape
{
  double base;
  double height;
public Triangle(double b,double h)
{
  base=b;
  height=h;
}
public void getArea()
{
  System.out.println(("Triangle_area="+base*height*0.5).toString());
}
}

public class Main
{
  public static void main(String args[])
  {
    Rectangle re;
    re = new Rectangle(5,4);
    re.getArea();

    Triangle tri;
    tri = new Triangle(5,4);
    tri.getArea();
  }
}
