package This;

class Parameter {

	Parameter()
	{
		System.out.println("im animal");
	}
	Parameter(String type)
	{
		System.out.println("TYPE:"+type);
	}
}
class Para extends Parameter
{
	Para()
	{
		super("animal");
		System.out.println("im parameter");
		
	}
}
class Parameterized{
	public static void main(String[]args)
	{
		Para p=new Para();
		
	}
	
}
