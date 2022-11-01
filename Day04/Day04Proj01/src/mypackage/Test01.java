package mypackage;

//initializing the instance variables using a default constructor 
class Person{
	//instance variables
	private String name;
	private int age;
	//default constructor
	Person(){
		name="Jay";
		age=28;
	}
	//method
	void talk() {
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.talk();
	}

}
