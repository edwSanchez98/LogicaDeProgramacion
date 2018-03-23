import java.util.Scanner;

public class Bela {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int hand = sc.nextInt();
			char palo = sc.next().charAt(0);
			int sum = 0;
			char[] Number = { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7' };
			int[] dominant = { 11, 4, 3, 20, 10, 14, 0, 0 };
			int[] notDominant = { 11, 4, 3, 2, 10, 0, 0, 0 };
			for (int i = 0; i < hand * 4; i++) {
				String cadena = sc.next();
				int temp = 0;
				for (int j = 0; j < Number.length; j++) {
					if (Number[j] == cadena.charAt(0)) {
						temp = j;
					}
				}
				if (cadena.charAt(1) == palo) {
					sum += dominant[temp];
				} else {
					sum += notDominant[temp];
				}
			}
			System.out.println(sum);
		}
	}
}
