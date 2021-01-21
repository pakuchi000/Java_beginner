
public class java46 {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};
		for(int i : a) {
			System.out.println(i+"があるよ。");
		}

		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"があるよ。");
		}

		String[] b = {"a", "b", "c"};
		for(String str : b) {
			System.out.println(str+"があるよ。");
		}


	}

}
