package mypackage;
abstract class Vehicle{
	abstract void drive();
	void applyBrake() {
		System.out.println("Applying Brake");
	}
}
class Car extends Vehicle{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving a Car");
	}
	void changeGear() {
		System.out.println("Changing a Gear");
	}
	
}
//class Car2 extends Car{
//	
//}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v=new Vehicle();//Error
		Vehicle v=new Car();
		v.applyBrake();
		v.drive();
		//v.changeGear();//error
		Car c=new Car();
		c.changeGear();
	}

}
