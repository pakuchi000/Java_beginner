package java入門part2;

public class Student2 {
	// メンバ変数(このクラスに情報として必要な情報)
	//prinvateでカプセル化
	private String name = "スクー太郎"; //氏名
	private int age = 20;	//年齢

	//コンストラクタ
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//アクセッサメソッド
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}

	}


	//自己紹介メソッド
	void introduction() {
		System.out.println("私の名前は" + name +"です");
		System.out.println("私の年齢は" + age +"です");
	}

	//年齢計算メソッド
	void ageCalculation() {
		age = age +1;
		System.out.println("私は、" + age + "歳になりました。");
	}
}
