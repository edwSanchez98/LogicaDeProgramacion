import java.util.Scanner;

public class AnioBiciesto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// pide dato de entrada
		System.out.print("Ingrese año: ");
		int anio = sc.nextInt();

		// llamamos al metodo esBiciesto para saber si es biciesto o no
		if (esBiciesto(anio)) {
			System.out.println("El año: " + anio + ", si es biciesto");
		} else {
			System.out.println("El año: " + anio + ", no es biciesto");
		}

	}

	// Método para saber si una año es biciesto o no
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
