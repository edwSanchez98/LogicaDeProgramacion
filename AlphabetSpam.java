import java.util.Scanner;

public class AlphabetSpam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double whiteSpaces = 0;
			double upperCase = 0;
			double lowerCase = 0;
			double symbols = 0;
			String cadena = sc.nextLine();
			char[] palabras = cadena.toCharArray();
			for (int i = 0; i < palabras.length; i++) {
				if (Character.isLowerCase(palabras[i])) {
					lowerCase++;
				} else if (Character.isUpperCase(palabras[i])) {
					upperCase++;
				} else if (palabras[i] == 95) {
					whiteSpaces++;
				} else {
					symbols++;
				}
			}
			System.out.printf("%.10f\n%.10f\n%.10f\n%.10f\n", whiteSpaces / palabras.length,
					lowerCase / palabras.length, upperCase / palabras.length, symbols / palabras.length);
		}
	}
}
