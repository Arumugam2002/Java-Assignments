/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. Its 
constructor having parameters for length and breadth is used to initialize the length 
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
constructor having a parameter for its side (suppose s) calling the constructor of its 
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.       */


class Rectangle{
	
	double length, breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void AreaRectangle()
	{
		double area = length * breadth;
		System.out.println("Area is " + area);
		
	}
	
	public void PerimeterRectangle()
	
	{
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter is " + perimeter);
	}
		
	
	
}

class Square extends Rectangle{

	double side;
	
	public Square(double side) {
		
		super(side, side);
	}
	
}




public class Q25_CreateAClassRectangleAndSquare {

	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(40.25,35.50);
		
		rect1.AreaRectangle();
		rect1.PerimeterRectangle();
		
		Square sqr1 = new Square(40);
		
		sqr1.AreaRectangle();
		sqr1.PerimeterRectangle();
	}
	
}
