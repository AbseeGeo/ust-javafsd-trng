package Enum;
enum Size1
{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}
class Test
{
	Size1 pizzasize;
	public Test(Size1 pizzasize)
	{
		this.pizzasize = pizzasize;
		//System.out.println(pizzasize);
	}
	
public void orderpizza()
{
	//System.out.println(pizzasize);
	switch(pizzasize) {
	case SMALL:
		System.out.println("i ordered a small size pizza");
		break;
	case MEDIUM:
		System.out.println("i ordered a MEDIUM size pizza");
		break;
	default:
		System.out.println("i don't know which one to order");
		break;
	}
	}
}
public class Enum2 
{
public static void main(String[]args)
{
	Test t1=new Test(Size1.MEDIUM);
	t1.orderpizza();
	//System.out.println("hi");
}
}
