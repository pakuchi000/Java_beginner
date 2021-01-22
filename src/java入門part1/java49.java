package java入門part1;

public class java49 {

	public static void main(String[] args) {

		boolean b = true;
		int i = 1;

		while(b) {
			if(i==6) {
				break;
			}

			System.out.println("iの値は"+i);
			i++;
		}
	}

}
