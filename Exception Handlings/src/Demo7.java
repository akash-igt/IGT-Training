import java.util.Iterator;

class Car extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 20; i++) 
		{
			try {
				if(Thread.currentThread().getName().equals("BMW"))
				{
					System.out.println(Thread.currentThread().getName()+" : "+i);
				}
				if(Thread.currentThread().getName().equals("Benz"))
				{
					System.out.println("         "+Thread.currentThread().getName()+" : "+i);
				}
				Thread.sleep(1000);
				
			} catch (InterruptedException ie) {
				
			}
		}
	}
	
}
public class Demo7 {
	public static void main(String[] args) {
		Car c=new Car();
		Thread t1=new Thread(c); //baby born
	//		t1.stop();      //kill the baby
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		t1.setName("BMW");
		t2.setName("Benz");
		for (int k = 0; k <= 20; k++) {
			try {
				Thread.sleep(1000);
				System.out.println("                  K : "+k);
				if(k==10)
				{
					t1.suspend();
				}
				if(k==15)
				{
					t1.resume();
				}
				if(k==5)
				{
					t1.suspend();
				}
				if(k==12)
				{
					System.out.println("Is im Alive ? : "+t2.isAlive());
				}
				if(k==14)
				{
					t2.stop();
				}
				if(k==16)
				{
					System.out.println("Is im Alive ? : "+t2.isAlive());
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
