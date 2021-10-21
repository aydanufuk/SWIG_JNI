
import java.util.Iterator;

public class TestDriver {

	static {
		try {
			System.loadLibrary("module_struct_access");
		} catch (UnsatisfiedLinkError e) {
			System.out.println("Native code failed to load\nDynamic Linkling problem in SWIG\n " + e);
			System.exit(1);
		}
	}

	public static void main(String[] args) {

		System.out.println("\njava start\n");

		D_data dd_struct = new D_data();
		module_struct_access_3.setDStruct(dd_struct);

		SWIGTYPE_p_a_4__a_5__int parr = module_struct_access_3.int_array_3_4_5(3);

		/*
		 * module_struct_access_3.int_3_4_5_set(parr, 0, 0, 0, 1500); int test_result =
		 * module_struct_access_3.int_3_4_5_get(parr, 0, 0, 0);
		 * System.out.println(test_result);
		 */

		for (int idx = 0; idx < 3; idx++) {
			for (int idy = 0; idy < 4; idy++) {
				for (int idz = 0; idz < 5; idz++) {
					module_struct_access_3.int_3_4_5_set(parr, idx, idy, idz, ((idx * 4 * 5) + (idy * 5) + idz));
				}
			}
		}

		System.out.println("Three dimensional array elements: ");
		for (int idx = 0; idx < 3; idx++) {
			System.out.println(idx);
			for (int idy = 0; idy < 4; idy++) {
				System.out.println();
				for (int idz = 0; idz < 5; idz++) {
					System.out.print("\t" + module_struct_access_3.int_3_4_5_get(parr, idx, idy, idz));
				}
			}
			System.out.println();
		}
		
		dd_struct.setX1(5);
		System.out.println("X1 value: " + dd_struct.getX1() );

		System.out.println("\njava end\n");
	}

}
