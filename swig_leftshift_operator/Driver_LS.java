import java.util.Scanner;

public class Driver_LS {
	static {
		try {
			System.loadLibrary("ls_swig");
		} catch (UnsatisfiedLinkError e) {
			System.out.println("Native code library failed to load\nDynamic linking problem in SWIG\n " + e);
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("java start");
		
		int result_lshift = ls_swig.argInit_double(1);
		System.out.println("Result of left shift of: 1 << 3 = " + result_lshift);
		
		SWIGTYPE_p_double p_d_arr = ls_swig.new_double_1d_array(10);
		
		double[] d_arr = new double[10];
		ls_swig.argInit_double_arr(d_arr);
		
		
		ls_swig.argInit_double_arr(d_arr);
		
		
		for(int i = 0; i < 2; ++i) {
			for(int j = 0; j < 5; ++j) {
				System.out.print(d_arr[i] + " ");
			}
			System.out.println();
		}
		
		
		input.close();
		System.out.println("java end");
	}
}
