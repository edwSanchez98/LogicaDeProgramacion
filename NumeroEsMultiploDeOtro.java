import java.util.Scanner;

public class NumeroEsMultiploDeOtro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese primer n�mero: ");
		int primerNumero = sc.nextInt();

		System.out.print("Ingrese segundo n�mero: ");
		int segundoNumero = sc.nextInt();

		if (primerNumero % segundoNumero == 0) {
			System.out.println("El n�mero: " + segundoNumero + ", es m�ltiplo de: " + primerNumero);
		} else {
			System.out.println("El n�mero: " + segundoNumero + ", no es m�ltiplo de: " + primerNumero);
		}
	}

}
