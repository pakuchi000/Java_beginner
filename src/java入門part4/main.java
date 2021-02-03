package java入門part4;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		human h1 = new human();
			h1.setNameAge("一郎", 21);

		human h2 = new human();
			h2.setNameAge("二郎", 22);

		human h3 = new human();
			h3.setNameAge("三郎", 21);


		ArrayList<human> List = new ArrayList<>();

			List.add(h1);
			List.add(h2);
			List.add(h3);

		for(int i = 0; i < List.size(); i++) {
			List.get(i).mySpeak();
			System.out.println(List.get(i));
		}







	}

}
