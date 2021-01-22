package java入門part2;

public class School5 {
	public static void main(String[] args) {
		//インスタンス化
		Student5 s = new Student5();

		//住所の設定
		s.setAddress("大阪府淀川区");
		//住所の所得
		System.out.println("住所は" + s.getAddress() + "です。");
			//以下でも可能
			//String address = s.getAddress();
			//System.out.println("住所は" + address + "です。");


		//自己紹介(1回目)
		s.introduction();

		//年齢の計算
		s.ageCalculation();

		//自己紹介(2回目)
		s.introduction();

	}
}
