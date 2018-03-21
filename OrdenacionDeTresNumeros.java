import java.util.Scanner;

public class OrdenacionDeTresNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese primer número: ");
		int primerNumero = sc.nextInt();

		System.out.print("Ingrese segundo número: ");
		int segundoNumero = sc.nextInt();

		System.out.print("Ingrese tercer número: ");
		int tercerNumero = sc.nextInt();

		if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
			if (segundoNumero > tercerNumero) {
				System.out.println("El número mayor es: " + primerNumero + "\nEl número del" + "medio es: "
						+ segundoNumero + "\nEl número menor es: " + tercerNumero);
			} else {
				System.out.println("El número mayor es: " + primerNumero + "\nEl número del" + "medio es: "
						+ tercerNumero + "\nEl número menor es: " + segundoNumero);
			}
		} else if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
			if (primerNumero > tercerNumero) {
				System.out.println("El número mayor es: " + segundoNumero + "\nEl número del" + "medio es: "
						+ primerNumero + "\nEl número menor es: " + tercerNumero);
			} else {
				System.out.println("El número mayor es: " + segundoNumero + "\nEl número del" + "medio es: "
						+ tercerNumero + "\nEl número menor es: " + primerNumero);
			}
		} else {
			if (primerNumero > segundoNumero) {
				System.out.println("El número mayor es: " + tercerNumero + "\nEl número del" + "medio es: "
						+ primerNumero + "\nEl número menor es: " + segundoNumero);
			} else {
				System.out.println("El número mayor es: " + tercerNumero + "\nEl número del" + "medio es: "
						+ segundoNumero + "\nEl número menor es: " + primerNumero);
			}
		}
	}
}
