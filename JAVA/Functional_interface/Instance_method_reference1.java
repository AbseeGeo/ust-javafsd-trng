package functional_interface;

import java.util.function.BiFunction;
class Arithematic
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
public class Instance_method_reference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer>adder=new Arithematic()::add;
		int result=adder.apply(10, 20);
		System.out.println(result);

	}

}
