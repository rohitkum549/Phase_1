package mypackage;

class Student{
	
//instance variables
	private String name;
	private String course;
	private int rollNo;
	//default constructor
	Student(){
		rollNo=555;
		name="Mendu";
		course="Java FSD";
	}
	
	//parameterized constructor
	Student(int rno,String n,String c){
		rollNo=rno;
		name=n;
		course=c;
	}
	
	//method for printing student details
	void printData() {
		System.out.println("Roll No:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
	}
}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.printData();
		Student s2=new Student(666,"Mruthyunjay","Full Stack Developer");
		s2.printData();
	}

}
