package java入門part1;

public class java41 {

	public static void main(String[] args) {

		int x = 5, z = 5;
		double y = 2000;

		if(x >= 10){
			System.out.println("xは、Hello!");
		}else {
			System.out.println("xは、Goodbye");
		}


		if(y < 100) {
			System.out.println("yは、Hello!");
		}else if(y > 150) {
			System.out.println("yは、Come on!");
		}else {
			System.out.println("yは、Goodbye");
		}

		if(x == z){
			System.out.println("zは、Hello!");
		}

	}

}
