package mypackage;

class AgeException extends Exception{
	AgeException(String msg){
		super(msg);
	}
	
}
class Customer{
	void setAge(int age) throws AgeException
	{
		if(age<18||age>60)
			throw new AgeException("Age should be between 18 and 60");
		else
			System.out.println("Your age:"+age);
	}
}
public class CustomerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		try {
			c.setAge(75);
		}
		catch(AgeException e) {
			System.err.println(e.getMessage());
		}
	}

}
