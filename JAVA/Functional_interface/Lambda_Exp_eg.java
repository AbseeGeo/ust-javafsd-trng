package functional_interface;
@FunctionalInterface
interface Drawable{
	public void draw();
}
public class Lambda_Exp_eg {
	public static void main(String[]args)
	{
		int width=10;
		Drawable d2=()->{
			System.out.println("drawing"+width);
		};
		d2.draw();
	}

}
