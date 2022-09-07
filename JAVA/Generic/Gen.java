package generic;

public class Gen<T> {
	T t;
	public T get() {
		return  t;
		
	}
	
	public void set(T t){
		  
this.t=t;

	}
	public static void main(String[]args) {
		Gen<String> g=new Gen<>();
		g.set("absee");
		System.out.println(g.get());
		Gen<Integer> gq=new Gen<>();
		gq.set(100);
		System.out.println(gq.get());
		
	}

}
