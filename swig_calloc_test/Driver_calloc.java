import java.util.Scanner;


public class Driver_calloc{
	static {
		try {
			System.loadLibrary("calloc_swig");
		}
		catch (UnsatisfiedLinkError e) {
			System.out.println("Native code library failed to load\nDynamic linking problem in SWIG\n " + e);
			System.exit(1);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("java start");
		
		calloc_swig.allocation_show();
		
		
		
		
		input.close();
		System.out.println("java end");
	}
}

