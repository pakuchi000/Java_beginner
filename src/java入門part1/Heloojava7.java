package java入門part1;

public class Heloojava7 {

	public static void main(String[] args) {

		int[] x;
		x = new int[6];
		x[0] = 10;
		x[1] = 11;
		x[2] = 12;
		x[3] = 13;
		x[4] = 14;
		x[5] = 15;

		String[] y = {"H","e","l","l","o","!"};

		System.out.println("配列xは、" + x[0] +x[1] +x[2]);
		System.out.println("配列yは、" + y[3] +y[4] +y[5]);

		int[] x2 = x;

		System.out.println("配列x2は、" + x2[0] +x2[1] +x2[2]);

		x2[0] = 20;

		System.out.println("配列xは、" + x[0] +x[1] +x[2]);

		System.out.println("配列yは、" + y[6]);



	}

}
