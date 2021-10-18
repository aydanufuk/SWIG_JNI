
public class JniDemo {

	static {
		try {
			System.loadLibrary("JniDemo");
		} catch (UnsatisfiedLinkError e) {
			System.out.println("Native Code Failed to load.");
			System.out.println("Dynamic Linking Library error in SWIG");
			System.out.println(e);
			System.exit(1);
		}
	}

	public native static void calThreeDimensional(int[][][] src, int[][][] dst);

	public static void main(String[] args) {

		System.out.println("\njava start\n");

		int x = 3, y = 4, z = 5;
		int[][][] arr3d_src = new int[x][y][z];
		int[][][] arr3d_dst = new int[x][y][z];

		int idx, idj, idk;
		// JniDemo.calThreeDimensional(arr3d_src, arr3d_dst);

		for (idx = 0; idx < x; ++idx) {
			System.out.println(idx);
			for (idj = 0; idj < y; ++idj) {
				System.out.println();
				for (idk = 0; idk < z; ++idk) {
					arr3d_src[idx][idj][idk] = (idx * y * z) + (idj * z) + idk;
					System.out.print("\t" + arr3d_src[idx][idj][idk]);
				}
			}
			System.out.println("\n");
		}
		System.out.println("------------------------------------------");
		calThreeDimensional(arr3d_src, arr3d_dst);

		for (int i = 0; i < 3; ++i) {
			System.out.println(i);
			for (int j = 0; j < 4; ++j) {
				System.out.println();
				for (int k = 0; k < 5; ++k) {
					System.out.print("\t" + arr3d_dst[i][j][k]);
				}
			}
			System.out.println("\n");
		}

		System.out.println("\njava end\n");
	}

}