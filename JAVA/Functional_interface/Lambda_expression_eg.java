package functional_interface;
interface Addable
{
	int add(int a,int b);
}
public class Lambda_expression_eg {
	public static void main(String[]args)
	{
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10,20));
		Addable ad2=(int a,int b)->(a+b);
		System.out.println(ad2.add(100,200));
		
	}

}
