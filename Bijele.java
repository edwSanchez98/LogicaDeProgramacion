import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int[] numeros = new int[6];
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = sc.nextInt();
			}
			String cadena = "";
			cadena += validarSiEsReinaORey(numeros[0]);
			cadena += validarSiEsReinaORey(numeros[1]);
			cadena += validarSiEsTorreCaballoOAlfil(numeros[2]);
			cadena += validarSiEsTorreCaballoOAlfil(numeros[3]);
			cadena += validarSiEsTorreCaballoOAlfil(numeros[4]);
			cadena += validaSiEsPeon(numeros[5]);
			System.out.println(cadena);
		}
	}

	public static String validarSiEsReinaORey(int numero) {
		return 1 - numero + " ";
	}

	public static String validarSiEsTorreCaballoOAlfil(int numero) {
		return 2 - numero + " ";
	}

	public static String validaSiEsPeon(int numero) {
		return 8 - numero + " ";
	}
}
