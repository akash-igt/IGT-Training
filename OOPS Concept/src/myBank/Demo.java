package myBank;

class Sbi extends Bank
{

	@Override
	void ATM() {
		System.out.println("Rupay Card");
		
	}

	@Override
	void FD() {
		System.out.println("9.5%");
		
	}
	
}
class Axis extends Bank
{

	@Override
	void ATM() {
		System.out.println("Master Card");
		
	}

	@Override
	void FD() {
		System.out.println("12%");
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.ATM();
		s.FD();
		Axis a=new Axis();
		a.ATM();
		a.FD();

	}

}
