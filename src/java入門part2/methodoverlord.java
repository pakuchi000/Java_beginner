package java入門part2;

public class methodoverlord {
	//引数3つで、戻り値に配列を返す。
	String[] memorize(String one,String two,String three) {
		String[] memory = {one, two, three};
		return memory;
	}
	//memorizeのオーバーロード
	String[] memorize(String one,String two,String three,String four) {
		String[] memory = {one, two, three, four};
		return memory;
	}

	//staticメソッド(クラスに依存しない)の作成。
	static String numberTranslate(int number) {
		switch(number) {
		case 1:
			return "one";
		default:
			return "1以外";
	}
}

}
