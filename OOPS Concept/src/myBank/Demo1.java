package myBank;

abstract class A 
{
	abstract void abc();
	abstract void xyz();

}

abstract class B extends A
{

	@Override
	void abc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void xyz() {
		// TODO Auto-generated method stub
		
	}
	abstract void pqr();

	
	
}
class C extends B
{

	@Override
	void pqr() {
		// TODO Auto-generated method stub
		
	}

	
	
}
public class Demo1 {

	public static void main(String[] args) {
		C c=new C();

	}

}
