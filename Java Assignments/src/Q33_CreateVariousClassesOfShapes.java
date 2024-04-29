
/* Create a class named 'Shape' with a method to print "This is this is shape". Then 
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print "This is rectangular shape" and "This is circular shape" 
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class.           */ 

class ShapeClass{
	
	public void printStatement()
	{
		System.out.println("This is Shape");
	}
}

class RectangleClass extends ShapeClass{
	
	public void printStatement1()
	{
		System.out.println("This is rectangular shape");
		
	}
	
}

class Circle extends ShapeClass{
	
	public void printStatement2()
	{
		System.out.println("This is circular shape");
		
	}
	
}

class SquareShape extends RectangleClass{
	
	public void printStatement3()
	{
		System.out.println("Square is a Rectangle");
	}
	
}

public class Q33_CreateVariousClassesOfShapes {

	public static void main(String[] args)
	{
		SquareShape sqr1 = new SquareShape();
		
		sqr1.printStatement();
		sqr1.printStatement1();
	}
	
	
}
