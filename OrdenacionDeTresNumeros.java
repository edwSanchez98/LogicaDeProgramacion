import java.util.Scanner;

public class OrdenacionDeTresNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese primer n�mero: ");
		int primerNumero = sc.nextInt();

		System.out.print("Ingrese segundo n�mero: ");
		int segundoNumero = sc.nextInt();

		System.out.print("Ingrese tercer n�mero: ");
		int tercerNumero = sc.nextInt();

		if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
			if (segundoNumero > tercerNumero) {
				System.out.println("El n�mero mayor es: " + primerNumero + "\nEl n�mero del" + "medio es: "
						+ segundoNumero + "\nEl n�mero menor es: " + tercerNumero);
			} else {
				System.out.println("El n�mero mayor es: " + primerNumero + "\nEl n�mero del" + "medio es: "
						+ tercerNumero + "\nEl n�mero menor es: " + segundoNumero);
			}
		} else if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
			if (primerNumero > tercerNumero) {
				System.out.println("El n�mero mayor es: " + segundoNumero + "\nEl n�mero del" + "medio es: "
						+ primerNumero + "\nEl n�mero menor es: " + tercerNumero);
			} else {
				System.out.println("El n�mero mayor es: " + segundoNumero + "\nEl n�mero del" + "medio es: "
						+ tercerNumero + "\nEl n�mero menor es: " + primerNumero);
			}
		} else {
			if (primerNumero > segundoNumero) {
				System.out.println("El n�mero mayor es: " + tercerNumero + "\nEl n�mero del" + "medio es: "
						+ primerNumero + "\nEl n�mero menor es: " + segundoNumero);
			} else {
				System.out.println("El n�mero mayor es: " + tercerNumero + "\nEl n�mero del" + "medio es: "
						+ segundoNumero + "\nEl n�mero menor es: " + primerNumero);
			}
		}
	}
}
