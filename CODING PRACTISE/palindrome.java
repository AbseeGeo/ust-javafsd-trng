package git;
import java.util.Scanner;

public class palindrome {

 public static void main(String[] args) 
 {
     String s, str = "";
// Create a scanner class to take input from keyboard.  
     Scanner a = new Scanner(System.in);
     System.out.print("Enter a string that you want to check: ");
      s = a.nextLine();

// Find the length of string using length() method of String class.    
     int l = s.length();
// Loop to get the reverse of string using charAt() method of String class.   
     for(int i = l - 1; i >= 0; i--)
     {
        str = str + s.charAt(i);
      }
// Condition to check whether two strings are equal and display the message.   
     if(s.equalsIgnoreCase(str))
           System.out.println("String " +str+ " is palindrome.");
     else
          System. out.println("String " +str+ " is not palindrome.");
 }
}