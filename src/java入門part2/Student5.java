package java入門part2;

public class Student5 {
	// メンバ変数(このクラスに情報として必要な情報)
	String name = "スクー太郎"; //氏名
	int age = 20;	//年齢
	int grade = 2;	//学年
	int rank = 1; 	//成績
	String address; //住所

	//設定メソッド
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}
	void setRank(int rank) {
		this.rank = rank;
	}
	void setAddress(String address) {
		this.address = address;
	}

	//所得メソッド
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getgrade() {
		return grade;
	}
	int getRank() {
		return rank;
	}
	String getAddress() {
		return address;
	}


	//自己紹介メソッド
	void introduction() {
		System.out.println("私の名前は" + name +"です");
		System.out.println("私の年齢は" + age +"です");
	}

	//年齢計算メソッド
	void ageCalculation() {
		age = age +1;
		System.out.println("\n私は、" + age + "歳になりました。\n");
	}
}
