package functional_interface;

public class Method_reference {
public void printMsg()
{
	System.out.println("hello,this is instance method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t2=new Thread(new Method_reference()::printMsg);
t2.start();
	}

}
