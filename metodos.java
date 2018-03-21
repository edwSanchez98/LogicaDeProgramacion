import java.util.Scanner;

public class metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

	// metodo para invertir un numero
	public static int winvertirNumero(int numero) {
		int num = 0;
		while (numero > 0) {
			num = num * 10 + numero % 10;
			numero /= 10;
		}
		return num;
	}

	// metodo para saber si un numero es primo
	public static boolean validarNumeroSiEsPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0) {
				primo = false;
			}
			contador++;
		}
		return primo;
	}

	// metodo para sumar los digitos de un numero
	public static int sumDigitos(int num) {
		int total = 0;
		while (num != 0) {
			total += num % 10;
			num /= 10;
		}
		return total;
	}

	// metodo para pasar de decimal a binario
	public static int decimalABinario(int numero) {
		String b = "";
		while (numero != 0) {
			b = numero % 2 + b;
			numero /= 2;
		}
		return Integer.parseInt(b);
	}

	// metodo para pasar de binario a decimal
	public static int binarioADecimal(int numero) {
		int decimal = 0;
		int power = 0;
		while (numero != 0) {
			decimal += numero % 10 * Math.pow(2, power);
			power++;
			numero /= 10;
		}
		return decimal;
	}

}
