package default_static;
interface Sayable{
	default void say() {
		System.out.println("hello,this is default method");
	}
	void sayMore(String msg);
}
public class Default_methods implements Sayable {
public void sayMore(String msg) {
	System.out.println(msg);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_methods dm=new Default_methods();
		dm.say();
		dm.sayMore("work is worship");
	}

}
