package java入門part4;

public class Calculater {

	int division(int i) throws OddNumberException{

		int div = i % 2;
		if(div != 0) {
			throw new OddNumberException();
		}else {
			return div;
		}
	}
}
