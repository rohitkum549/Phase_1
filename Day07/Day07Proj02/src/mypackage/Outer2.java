package mypackage;

public class Outer2 {

	private String msg="Today's Last Example";
	
	void display() {
		class Inner2{
			void msg() {
				System.out.println(msg);
			}
		}
		Inner2 in=new Inner2();
		in.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 obj=new Outer2();
		obj.display();
	}

}
