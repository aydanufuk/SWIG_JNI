public class Main {

	public static void main(String[] args)
	{		
		MyClass counter = new MyClass(3);
		counter.increment();
		counter.increment();
		System.out.println(counter.getValue());
	}
	
}