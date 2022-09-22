
package stream;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Product
{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Product> productsListq=new ArrayList<Product>();
productsListq.add(new Product(1,"hp",25000f));
productsListq.add(new Product(2,"dell",30000f));
productsListq.add(new Product(3,"lenovo",28000f));
productsListq.add(new Product(4,"sony",28000f));
productsListq.add(new Product(5,"apple",90000f));
Float totalPrice=productsListq.stream().map(product->product.price).reduce(0.0f, (sum,price)->sum+price);
System.out.println(totalPrice);
Float totalPrice2=productsListq.stream().map(product->product.price).reduce(0.0f, Float::sum);
System.out.println(totalPrice2);

}
}
