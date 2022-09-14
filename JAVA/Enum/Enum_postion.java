package Enum;

public class Enum_postion {
enum Position{
	Reema("panda"),Himanshu("bhardwaj"),Gettaanjali("sharma");
	String Name;
	Position(String s)
	{
		Name=s;
	}String showPostion()
	{
		return Name;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(Position pos:Position.values()) {
	int val=pos.ordinal()+1;
	System.out.println("firstname="+pos+"\nLASTNAME="+pos.showPostion()+"\nPOstionb inclass="+val);
System.out.println();
}
	}

}
