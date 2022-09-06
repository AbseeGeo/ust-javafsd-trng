package day3;

class A123
{
	protected String name;
	protected void display() {
		System.out.println("im animal.............");
	}
}
class Dog234 extends A123
{
	public void getInfo() {
		System.out.println("my nameis"+name);
	}
}




class Animal_override {
	
	public static void main(String[] args)
	{
		Dog234 lab=new Dog234();
		lab.name="rocky";
		lab.display();
		lab.getInfo();
		
	}

}

