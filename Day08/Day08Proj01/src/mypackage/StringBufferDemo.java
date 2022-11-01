package mypackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating StringBuffer:");
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your Learning...");
		System.out.println(s);
		
		//insert method
		s.insert(6, "Hey,");
		System.out.println(s);
		
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(1, 3, "HEY");
		System.out.println(sb);
		
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
	}

}
