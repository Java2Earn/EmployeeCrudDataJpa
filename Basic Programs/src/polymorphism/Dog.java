package polymorphism;
final class  Animal
{
	Animal m1()
	{
		System.out.println("Animal class m1 method");
		//return new Animal();//name less object
		return this;
	}
}

public class Dog 
{
	Dog m1()
	{
		System.out.println("Dog class m1 method");
		//return new Dog();
		return this;
	}	
	
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.m1();
	}
}
