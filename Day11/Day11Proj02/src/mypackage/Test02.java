package mypackage;

class Bicycle{
	int gear;
	int speed;
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake(int decrement) {
		speed-=decrement;
	}
	public void speedUp(int increment) {
		speed+=increment;
	}
	@Override
	public String toString() {
		return "No. of gears are "+gear+"\nSpeed of bicycle is "+speed;
	}
}
class MountainBike extends Bicycle{
	int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	public void setHeight(int newValue) {
		seatHeight=newValue;
	}
	@Override
	public String toString() {
		return super.toString()+"\nSeat Height is"+seatHeight;
	}
	
}
public class Test02 {
 public static void main(String[] args) {
	 MountainBike mb=new MountainBike(3,60,25);
	 System.out.println(mb.toString());
 }
}
