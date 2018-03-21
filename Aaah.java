import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String paciente = sc.nextLine();
			String doctor = sc.nextLine();
			int cont = 0;
			int cont2 = 0;
			for (int i = 0; i < paciente.length(); i++) {
				if (String.valueOf(paciente.charAt(i)).equals("a")) {
					cont++;
				}
			}
			for (int i = 0; i < doctor.length(); i++) {
				if (String.valueOf(doctor.charAt(i)).equals("a")) {
					cont2++;
				}
			}
			if (cont >= cont2) {
				System.out.println("go");
			} else {
				System.out.println("no");
			}
		}
	}
}
