package functional_interface;
@FunctionalInterface
interface sayable{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class Functional_interface_eg2 implements sayable {
public void say(String msg)
{
	System.out.println(msg);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functional_interface_eg2 fie=new Functional_interface_eg2();
		fie.say("hello there");
	}

}
