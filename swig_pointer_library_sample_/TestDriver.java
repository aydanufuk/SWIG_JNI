
public class TestDriver {
	
	static {
		try {
			System.loadLibrary("example");
		}
		catch(UnsatisfiedLinkError e) {
			System.out.println("Native code library failed to load\nDynamic linking problem in SWIG\n " + e);
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("\njava start\n");
		System.out.println("pointer library test\n");
		
		SWIGTYPE_p_int a = example.new_intp();
		SWIGTYPE_p_int b = example.new_intp();
		SWIGTYPE_p_int c = example.new_intp();
		
		example.intp_assign(a, 5);
		example.intp_assign(b, 10);
		example.intp_assign(c, 2);
		
		System.out.println("Initial a value: " + Long.toHexString(SWIGTYPE_p_int.getCPtr(a)));
		System.out.println("Initial b value: " + Long.toHexString(SWIGTYPE_p_int.getCPtr(b)));
		System.out.println("Initial c value: " + Long.toHexString(SWIGTYPE_p_int.getCPtr(c)));
		
		example.add(a, b, c);
		int result_add = example.intp_value(c);
		System.out.println("5+10 = " + result_add);
		
		/*
		 * // Clean up the pointers example.delete_intp(a); example.delete_intp(b);
		 * example.delete_intp(c);
		 */
		
		example.sub(a, b, c);
		int result_sub = example.intp_value(c);
		System.out.println("5-10 = " +  result_sub);
		
		example.divide(100, 30, c);
		int result_div = example.intp_value(c);
		System.out.println("100/50 = " + result_div);
	    
	    
		
		System.out.println("\njava end\n");
		
	}

}
