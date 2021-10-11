
public class TestDriver {
	public static void main(String[] args) {
		System.loadLibrary("sa");

		System.out.println("\n\n<<<java start>>>\n\n");

		demo_data dd = new demo_data();

		sa.setDemoStruct(dd);

		SWIGTYPE_p_int pi = sa.new_intArray(4);
		sa.intArray_setitem(pi, 0, 10);
		sa.intArray_setitem(pi, 1, 11);
		sa.intArray_setitem(pi, 2, 12);
		sa.intArray_setitem(pi, 3, 13);

		dd.setX1(5);
		System.out.println("X1 Values: " + dd.getX1());

		SWIGTYPE_p_a_16__char pch = sa.new_char4_16();
		// sa.char4_16_set(pch, 0, 0, 'a');

		int counter = 0;
		
		for (int idx = 0; idx < 4; ++idx) {

			for (int jdx = 0; jdx < 16; ++jdx) {
				counter++;
				char c=(char)(counter+' ');
				sa.char4_16_set(pch, idx, jdx, c);
			}
		}

		dd.setS1(pch);
		System.out.println("S1 Values");
		for (int idx = 0; idx < 4; ++idx) {

			for (int jdx = 0; jdx < 16; ++jdx) {
				System.out.print(" " + sa.char4_16_get(pch, idx, jdx));
			}
			System.out.println();
		}

		System.out.println("X2 Values:");
		for (int idx = 0; idx < 4; ++idx) {

			System.out.println(sa.intArray_getitem(pi, idx));
		}

		System.out.println("\n\n<<<java end>>>");
	}

}
