package java入門part2;

public class Student3 {
	// メンバ変数(このクラスに情報として必要な情報)
	//prinvateでカプセル化
	private String name = "スクー太郎"; //氏名
	private int age = 20;	//年齢
	private int grade = 2;	//学年
	private int rank = 1;	//順位

	//コンストラクタ
	public Student3(String name, int age, int grade, int rank) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.rank = rank;
	}

	//アクセッサメソッド
	//名前メソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//年齢メソッド
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
	}
	//学年メソッド
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		if(grade>0) {
			this.grade = grade;
		}
	}
	//順位メソッド
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		if(rank>0) {
			this.rank = rank;
		}
	}

	//自己紹介メソッド
	void introduction() {
		System.out.println("私の名前は" + name +"です");
		System.out.println("私の年齢は" + age +"です");
		System.out.println("私の学年は" + grade +"です");
		System.out.println("私の順位は" + rank +"です");
	}

	//年齢計算メソッド
	void ageCalculation() {
		age = age +1;
		System.out.println("私は、" + age + "歳になりました。");
	}
}
