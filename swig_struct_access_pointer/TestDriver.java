import java.util.Scanner;

public class TestDriver {
	static {
		try {
			System.loadLibrary("struct_in_pointer");
		} catch (UnsatisfiedLinkError e) {
			System.out.println("Native code library failed to load\nDynamic linking problem in SWIG\n " + e);
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("java start");

		d_data temp_data = new d_data();

		struct_in_pointer.setDemoStruct(temp_data);

		SWIGTYPE_p_int pint = struct_in_pointer.new_intp();

		struct_in_pointer.intp_assign(pint, 500);

		System.out.println(struct_in_pointer.intp_value(pint));

		temp_data.setX1(2500);
		System.out.println(temp_data.getX1());

		input.close();
		System.out.println("java end");
	}
}
