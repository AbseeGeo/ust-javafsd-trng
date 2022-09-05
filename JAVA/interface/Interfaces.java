package interfaces_programs;

interface Language{
	void getName(String name);
	
}
class pgming implements Language
{
	public void getName(String name)
	{
		System.out.println("programming language:"+name);
		
	}
}

class Interfaces {
	public static void main(String[]args)
	{
		pgming lang=new pgming();
		lang.getName("java");
	}

}
