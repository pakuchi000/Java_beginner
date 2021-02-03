package java入門part4;

public class RunCal {
	public static void main(String[] args) {
		Calculater c = new Calculater();
		int i = 0;
		try {
			i = c.division(11);
			System.out.println("余りは" + i + "です。");
		}catch(OddNumberException e) {
			e.printStackTrace();
			System.out.println("例外が発生しました。");
		}
	}
}
