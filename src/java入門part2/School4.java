package java入門part2;
public class School4 {
	public static void main(String[] args) {
		//インスタンス化
		Student3 s = new Student3("渋谷太郎", 22, 2, 1);
		//自己紹介(1回目)
		s.introduction();
		//年齢計計算
		s.ageCalculation();
		//自己紹介(2回目)
		s.introduction();

		//アクセッサメソッドを使って設定
		s.setName("変更太郎");
		s.setAge(23);
		s.setGrade(4);
		s.setRank(9);

		//自己紹介(1回目)
		s.introduction();
		//年齢計計算
		s.ageCalculation();
		//getName
		s.getName();
		//自己紹介(2回目)
		s.introduction();


	}
}
