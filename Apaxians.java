import java.util.Scanner;

public class Apaxians {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char [] word = (sc.nextLine().toCharArray());
			String wordComplete = "";
			char temp = ' ';
			for (char c : word) {
				if (temp != c) {
					wordComplete += c;
					temp = c;
				}
			}	
			System.out.println(wordComplete);
		}
	}
}
