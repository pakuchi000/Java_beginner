package java入門part1;

public class java45 {

	public static void main(String[] args) {

		int i = 1;
		while(i <= 5) {
			System.out.println(i + "回目のHello!");
			i += 1;
		}

		int p = 1;
		while(p <= 50) {
			System.out.println(p + "回目のHello!");
			p = 2 * p;
		}

		String b = "";
		while(b.isEmpty()) {
			System.out.println("bは空欄です。");
			b += "A";
		}

		System.out.println("bは" + b + "です。");
		b += "A";
		System.out.println("bは" + b + "です。");

	}

}
