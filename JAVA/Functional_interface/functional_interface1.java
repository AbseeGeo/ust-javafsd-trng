package functional_interface;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
}
public class functional_interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyInterface ref;
ref=()->3.1415;
System.out.println("value of pi="+ref.getPiValue());
	}

}
