/* Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
having a method with the same name 'message' that prints "This is first subclass" 
and "This is second subclass" respectively. Call the methods 'message' by creating 
an object for each subclass        */

abstract class Parent{
	
	abstract void message();
	
		
	
	
}

class subClass1 extends Parent{
	
	 public void message()
	{
		System.out.println("This is first subclass");
	}
	
}

class subClass2 extends Parent{
	
	public void message()
	{
		System.out.println("This is second subclass");
	}
}

public class Q28_CreateAbstractClassParentAndtheirTwoSubClasses {
	
	
	public static void main(String[] args)
	{
		subClass1 sub1 = new subClass1();
		subClass2 sub2 = new subClass2();
		
		sub1.message();
		sub2.message();
		
		
	}

}
