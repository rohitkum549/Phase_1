package mypackage;

//Thread unsafe - Two threads acting on same object

class Reserve implements Runnable{
	//available berths are 1
	int available=1;
	int wanted;
	
	//accept wanted berths at run time
	Reserve(int i){
		wanted=i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//display available berths
		System.out.println("Available berths:"+available);
		if(available>=wanted) {
			//get the passenger name
			String name=Thread.currentThread().getName();
			//allot the berth to him
			System.out.println(wanted+" Berths reserved for "+name);
			try {
				Thread.sleep(2000);
				available=available-wanted;//update the no. of available berths
			}
			catch(InterruptedException ie) {
				
			}	
		}
		//if available berths are less, display sorry
		else {
			System.out.println("Sorry, no berths");
		}
	}
	
}
public class Unsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tell that 1 berth is needed
		Reserve obj=new Reserve(1);
		
		//attach first thread to the object
		Thread t1=new Thread(obj);
		//attach second thread to the object
		Thread t2=new Thread(obj);
		
		//take the thread names as person names
		t1.setName("First Person");
		t2.setName("Second Person");
		
		//send the requests for berth
		t1.start();
		t2.start();
	}

}
