package generic;

public class Generic5 {
	
	public static <T> boolean isEqual(Generics Type<T> g1,Generics Type<T> g2)
	{
		return g1.get().equals(g2.get());
	}

public static void main(String[] args) {
	GenericsType<String> g1=new GenericsType<>();
	g1.set("panka");
	GenericsType<String> g2=new GenericsType<>();
	g2.set("panka");
	boolean isEqual=Generic5.<String>isEqual(g1,g2);
	isEqual=Generic5.isEqual(g1, g2);
}
}
