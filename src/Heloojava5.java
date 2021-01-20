
public class Heloojava5 {

	public static void main(String[] args) {

		int a = 1000000;
		long b = 0;
		double c = 0.0;
		byte d = 0;

		System.out.println("aは　" + a);
		System.out.println("b=aは　" + (b=a));
		System.out.println("c=aは　" + (c=a));
		System.out.println("d=aは　" + (d=(byte)a));
		System.out.println("d+1は　" + (d + 1));

	}

}
