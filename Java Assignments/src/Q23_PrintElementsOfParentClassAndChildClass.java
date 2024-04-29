/* Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class    */

class A{
	
	public void printStatement(){
		System.out.println("This is parent class");
	}
	
}

class B extends A{
	
	@Override
	public void printStatement()
	{
		System.out.println("This is child class");
	}
}



public class Q23_PrintElementsOfParentClassAndChildClass {

	public static void main(String[] args)
	{
		A a1 = new A();
		
		B b1 = new B();
		
		a1.printStatement();
		
		b1.printStatement();
		
		A a2 = new B();
		
		a2.printStatement();
		
		
		
		
	}
	
}
