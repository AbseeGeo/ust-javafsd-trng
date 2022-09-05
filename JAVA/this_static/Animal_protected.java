package This;

class Animal_protected {
	protected String_type="animal";
	

}class Dog2 extends Animal{
	public String type="mammal";
	public void printType()
	{
		System.out.println("im a"+type);
		System.out.println("im an"+super.type);
	}
}
