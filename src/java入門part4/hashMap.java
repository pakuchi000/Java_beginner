package java入門part4;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String, String> stringMap =
				new HashMap<>(); //ダイヤモンド演算子, <>の中身を省略
		stringMap.put("value1", "ABC");
		stringMap.put("value2", "AB");
		stringMap.put("value3", "A");

		System.out.println("文字列のマップ");
		for(int i = 1; i <= stringMap.size(); i++) {
			System.out.println(stringMap.get("value" + i));
		}

	}

}
