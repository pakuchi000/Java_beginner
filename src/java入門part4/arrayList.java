package java入門part4;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();

		stringList.add("ABC");
		stringList.add("DEF");
		stringList.add("GHI");


		System.out.println("文字列のリスト");
		for(int i =0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}

		ArrayList<Integer> integerList = new ArrayList<Integer>();

		integerList.add(1);
		integerList.add(2);
		integerList.add(3);


		System.out.println("数字のリスト");
		for(int i =0; i < integerList.size(); i++) {
			System.out.println(integerList.get(i));
		}
	}
}
