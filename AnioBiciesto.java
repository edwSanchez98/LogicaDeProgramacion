import java.util.Scanner;

public class AnioBiciesto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// pide dato de entrada
		System.out.print("Ingrese a�o: ");
		int anio = sc.nextInt();

		// llamamos al metodo esBiciesto para saber si es biciesto o no
		if (esBiciesto(anio)) {
			System.out.println("El a�o: " + anio + ", si es biciesto");
		} else {
			System.out.println("El a�o: " + anio + ", no es biciesto");
		}

	}

	// M�todo para saber si una a�o es biciesto o no
	public static boolean esBiciesto(int anio) {
		if (anio % 400 == 0) {
			return true;
		} else if (anio % 100 == 0) {
			return false;
		} else if (anio % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
