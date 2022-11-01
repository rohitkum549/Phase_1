package mypackage;

abstract class Sample{
void method1(){//code//defined or implemented or concrete method
	
}
abstract void method2();//declared method
}
class Demo extends Sample
{
void method2()
{
//code
}
void method3()
{
//code
}
}
abstract class Sample2 extends Sample
{
void method4(){//code	
}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sample obj=new Sample();//error
		Sample obj=new Demo();
	}

}
