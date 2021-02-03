package java入門part4;

public class human {
	private String name  = "名無しのゴンべ";
	private int age = 0;

	void mySpeak() {
		System.out.println("私の名前は" + this.name +"です。");
		System.out.println("年齢は" + this.age + "です。");
	}

	void setNameAge(String name,int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return this.name;
	}

	int getAge() {
		return this.age;
	}




}
