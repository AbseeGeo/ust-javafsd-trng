package git;
import java.lang.*;
import java.io.*;
import java.util.*;
public class string_reverse {

	public static void main(String[] args)
	{
		String input = "Geeks for Geeks";

		StringBuilder input1 = new StringBuilder();
		input1.append(input);

		// reverse StringBuilder input1
		input1.reverse();

		// print reversed String
		System.out.println(input1);
	}

}