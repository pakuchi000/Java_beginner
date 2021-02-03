package java入門part4;

import java.util.ArrayList;
import java.util.Random;

public class PackageSample {
	public static void main(String[] args) {
		//乱数の表示
		Random random = new Random();
		System.out.println("乱数の表示");
		System.out.println(random.nextInt());

		//乱数の格納
		ArrayList<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt());
		}

		//配列表示
		System.out.println("配列に格納した値の表示");
		for(int i : list) {
			System.out.println(i);
		}
	}
}
