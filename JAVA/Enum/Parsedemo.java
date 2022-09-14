
package Enum;
import java.time.Period;
public class Parsedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String age="P17Y9M5D";
Period p=Period.parse(age);
System.out.println("the age is:");
System.out.println(p.getYears()+"years\n"+p.getMonths()+"months\n"+p.getDays()+"days\n");
	}



}
