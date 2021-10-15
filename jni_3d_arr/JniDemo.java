
public class JniDemo {
	
	static {
		try {
			System.loadLibrary("arr3d");
		}
		catch(UnsatisfiedLinkError e)
		{
			System.out.println("Native Code Failed to load.");
			System.out.println("Dynamic Linking Library in SWIG");
			System.out.println(e);
			System.exit(1);
		}
	}
	
	public native static void calThreeDimensional(int[][][] src,int[][][] dst);
	
	public static void main(String[] args) {
		
		System.out.println("java start");
				
		System.out.println("java end");
	}

}
