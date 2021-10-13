
public class TestDriver {
	
	static {
		try {
			System.loadLibrary("example");
		}
		catch(UnsatisfiedLinkError e) {
			System.out.println("Native code failed to load\nDynamic Linkling problem in SWIG\n " + e);
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("java start");
		
		SWIGTYPE_p_Point point_ptr = example.new_Point(25, 75);
		example.setPtptr(point_ptr);
		System.out.println("Point set");
		
		System.out.println("Point x and y: " + example.Point_print(point_ptr));
		
		
		
		
		
		
		System.out.println("java end");		
	}

}
