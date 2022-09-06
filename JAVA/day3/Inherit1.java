package day3;


class Animalp
{
	public void displayinfo()
	{
		System.out.println("im animalssssssssssss");
	}}
class Dogi extends Animalp
{
	public void displayinfo()
	{
		super.displayinfo();
		System.out.println("im dog");
		
	}
}
class Inherit1 {
	
	public static void main(String[]args)
	{
		Dogi d=new Dogi();
		d.displayinfo();
	}

}



