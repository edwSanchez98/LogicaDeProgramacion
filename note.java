import java.util.Scanner;

public class note {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			boolean bandera = true;
			int[] scala = new int[9];
			for (int i = 1; i < scala.length; i++) {
				scala[i] = sc.nextInt();
			}
			if (scala[1] == 1) {
				for (int i = 1; i < scala.length - 1; i++) {
					if (scala[i] == i && scala[i + 1] == i + 1) {
						bandera = true;
					} else {
						bandera = false;
						break;
					}
				}
				if (bandera) {
					System.out.println("ascending");
				} else {
					System.out.println("mixed");
				}
			} else if (scala[1] == 8) {
				int v = 8;
				for (int i = 1; i < scala.length - 1; i++) {
					if (scala[i] == v && scala[i + 1] == v - 1) {
						bandera = true;
					} else {
						bandera = false;
						break;
					}
					v--;
				}
				if (bandera) {
					System.out.println("descending");
				} else {
					System.out.println("mixed");
				}
			} else {
				System.out.println("mixed");
			}
		}
	}

}
