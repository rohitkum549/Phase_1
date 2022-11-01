package mypackage;

class Calc1{
	public void sum(int a,int b) {
		System.out.println("Base Class Sum:"+(a+b));
	}
}
class Calc2 extends Calc1{

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Derived class sum:"+(a+b));
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 obj1=new Calc1();
		obj1.sum(10, 20);
		Calc2 obj2=new Calc2();
		obj2.sum(10, 20);
		
		//Calc1 obj3=obj2;
		Calc1 obj3=new Calc2();
		obj3.sum(10, 20);
		
	}

}
