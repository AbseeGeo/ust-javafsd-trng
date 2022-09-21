package default_static;
interface Sayable1
{
	default void say()
	{
		System.out.println("hello,this is default method");
	}
	void sayMore(String msg);
	static void sayLouder(String msg)
	{
		System.out.println(msg);
	}
	
	}
public class Default_abstract implements Sayable1{
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_abstract dm=new Default_abstract();
		dm.say();
		dm.sayMore("work is worship");
		Sayable1.sayLouder("hellooooo");
	}

}
