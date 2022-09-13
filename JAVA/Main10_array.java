package com.ust;

public class Main10_array {
	public static void main(String[]args)
	{
		int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double avg;
		for(int number:numbers)
		{
			sum+=number;
		}
		int arrayLength=numbers.length;
		avg=((double)sum/(double)arrayLength);
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}

}
