package This;

 class Thismethod1 {
int val1;
int val2;
Thismethod1()
{val1=10;
val2=20;

}
void printval(Thismethod1 obj) 
{
	
	System.out.println("val1="+obj.val1+"val2="+obj.val2);
	
}
void get()
{
	printval(this);
	
}
}
 class Thismethod
 {
	 public static void main(String[]args)
	 {
		 Thismethod1 obj=new Thismethod1();
		 obj.get();
	 }
	 
	 }
 
