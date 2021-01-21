
public class java44 {

	public static void main(String[] args) {

		int a = 400, b =39;
		int x = a + b;
		int y = a / b;
		int z = a % b;

		if(x >= 10) {
			System.out.println("aとbの和は、10以上です。");
		}

		if(y >= 10) {
			System.out.println("a割るbは、10以上です。");
		}else {
			System.out.println("a割るbは、10未満です。");
		}

		if(z == 0) {
			System.out.println("a割るbの余りは、0です。");
		}else {
			System.out.println("a割るbの余りは、" + z + "です。");
		}

	}

}
