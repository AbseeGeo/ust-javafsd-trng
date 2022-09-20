package functional_interface;
interface Sayable{
	void say();
}
public class Method_reference3 {
	public static void saySomething()
	{
		System.out.println("hello,this is static method.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sayable sayable=Method_reference3::saySomething;
sayable.say();
	}
}

