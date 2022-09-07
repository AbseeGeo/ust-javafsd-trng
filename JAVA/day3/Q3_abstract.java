package day3;


abstract class Q13{
	
	int x=10;
	
	Q13(){
		
		System.out.println("Constructor in abstract class");
	}
	
	abstract void getX();
}


public class Q3_abstract extends Q13
{

	Q3_abstract(){
		super();
	}
	
	void getX() {
		
		System.out.println("x = "+x);
		
	}
	
	public static void main(String[] args) {
		
		Q3_abstract a = new Q3_abstract();
		a.getX();

	}

}