package Enum;
enum Enumsize
{
	SMALL,MEDIUM,LARGE,EXTRALARGE;


public String getSize() {
	switch(this)
	{
	case SMALL:
		return "small";
	case MEDIUM:
		return "medium";
	case LARGE:
		return "large";
	case EXTRALARGE:
		return "extra large";
		default:
			return null;
	}
}
public static void main(String[]args)
{
	System.out.println("size of pizza "+Enumsize.SMALL.getSize());
}
}