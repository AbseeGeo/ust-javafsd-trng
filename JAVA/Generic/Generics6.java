package generic;
import java.util.ArrayList;
import java.util.List;

public class Generics6 {
	
	public static void main(String[]args)
	{
		GenericsClass<Integer> intobj=new GenericsClass<>(5);
		
		System.out.println("returnsssssssssssssssssssssss:"+intobj.getData());
GenericsClass <String> stringobj=new GenericsClass<>("java  programmings");
		
		System.out.println("gs returns:"+stringobj.getData());
		
	}

}
class  GenericsClass<T>{
	private T data;
	public GenericsClass(T data)
	{
		this.data=data;
	}
	public T getData()
	{
		return this.data;
	}
}
