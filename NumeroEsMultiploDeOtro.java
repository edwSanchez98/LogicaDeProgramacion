import java.util.Scanner;

public class NumeroEsMultiploDeOtro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese primer número: ");
		int primerNumero = sc.nextInt();

		System.out.print("Ingrese segundo número: ");
		int segundoNumero = sc.nextInt();

		if (primerNumero % segundoNumero == 0) {
			System.out.println("El número: " + segundoNumero + ", es múltiplo de: " + primerNumero);
		} else {
			System.out.println("El número: " + segundoNumero + ", no es múltiplo de: " + primerNumero);
		}
	}

}
