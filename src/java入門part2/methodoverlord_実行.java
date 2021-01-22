package java入門part2;

public class methodoverlord_実行 {

	public static void main(String[] arg) {
		//インスタンス化
		methodoverlord m = new methodoverlord();

		//オーバーロード
		String[] memory3 = m.memorize("あの","その","どの");
		System.out.println(memory3[0] + memory3[1] + memory3[2]);

		String[] memory4 = m.memorize("あの","その","どの","連体詞");
		System.out.println(memory4[0] + memory4[1] + memory4[2] + memory4[3]);


		//staticメソッド
		//従来は以下の通り
		//String Translate = m.numberTranslate(0);
		String Translate = methodoverlord.numberTranslate(0);
		System.out.println(Translate);

	}
}
