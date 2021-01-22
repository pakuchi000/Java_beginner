package java入門part1;

public class java48 {

	public static void main(String[] args) {

		int[] ary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println("ary[]の中で、偶数の値は以下になります。");

		for(int i=0;i<ary.length;i++ ) {
			if(ary[i] %2 ==0) {
				System.out.println(ary[i]);
			}
		}

	}
}
