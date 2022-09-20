package functional_interface;

public class Method_Reference2 {

	public static void ThreadStatus() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
	}
		public static void main(String[] args) {
			Thread t2=new Thread(Method_Reference2::ThreadStatus);
t2.start();
	}
	

}
