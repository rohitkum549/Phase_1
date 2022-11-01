package mypackage;

public class Compute {

	public int sum(int x) {
		return x+100;
	}
	public int sum(int x,int y) {
		return x+y;
	}
	public int sum(int x,int y,int z) {
		return x+y+z;
	}
	public double sum(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute c=new Compute();
		System.out.println(c.sum(10));
		System.out.println(c.sum(10,20));
		System.out.println(c.sum(10,20,30));
		System.out.println(c.sum(12.56,15.78));
	}

}
