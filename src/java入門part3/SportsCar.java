package java入門part3;

//extendsで継承
public class SportsCar extends Car implements Audio{
//implementsでインターフェース

	//スポーツカーのメソッド
	void maxSpeed() {
		System.out.println("最大走行速度は、300km/hです。");
	}

	@Override
	public void play() {
		System.out.println("再生します");
	}
	public void stop() {
		System.out.println("停止します");
	}

}
