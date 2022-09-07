package generic;


class Test1<T>
{
	T ob;
	Test1(T ob)
	{
		this.ob=ob;
		}
		public T getObject()
		{
			return this.ob;
		}
	}
	

class Generic2 {
	
	public static void main(String[]args)
			{
		Test1<Integer> iobj=new Test1<Integer>(15);
		System.out.println(iobj.getObject());
		Test1<String> obj=new Test1<String>("abseee geo");
		System.out.println(obj.getObject());
		iobj=obj;
			}

}
