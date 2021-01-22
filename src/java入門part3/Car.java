package java入門part3;

public class Car implements USB, Audio{

	@Override
	public void energizing() {
		System.out.println("充電します");
	}

	@Override
	public void play() {
		System.out.println("再生します");
	}
	public void stop() {
		System.out.println("停止します");
	}

	//車のメソッド
	void nenpi(int liter) {
		System.out.println("燃料" + liter + "Lでは、" + 2*liter + "km走行可能です。");
	}
	void startEngine() {
		System.out.println("エンジンが入りました。");
	}
	void stopEngine() {
		System.out.println("エンジンを切ります。");
	}


}
