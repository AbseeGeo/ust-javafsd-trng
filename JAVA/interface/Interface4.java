package interfaces_programs;
interface Polygon
{
	void getArea();
	default void getSides()
	{
		System.out.println("i can get sides of polygon");
	}
}
class Rectangle implements Polygon
{
	public void getArea()
	{
		int length=6;
		int breadth=5;
		int area=length*breadth;
		System.out.println("area of rectangle"+area);
	}
	public void getSlides() {
		System.out.println("i have 4 sides");
	}
}



class Square implements Polygon
{
	public void getArea()
	{
		int length=5;
		int area=length*length;
		System.out.println("area of square is"+area);
	
	}
}
class Interface4 {
	public static void main(String[]args)
	{
		Rectangle r1=new Rectangle();
		r1.getArea();
		r1.getSides();
		Square s1=new 	Square();
		s1.getArea();
		s1.getSides();
	}
	}


