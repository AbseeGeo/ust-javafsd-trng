package generic;

class Generic <T,U>
{
	T obj1;
	U obj2;
	Generic(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
public void  print()
{
	System.out.println(obj1);
	System.out.println(obj2);
}
}
class Generic1
{
	public static void main(String[]args)
	{
		Generic<String,Integer>obj=new Generic<String,Integer>("gfg",15);
		obj.print();
	}
}
