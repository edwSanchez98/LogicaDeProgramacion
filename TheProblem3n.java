import java.util.Scanner;

public class TheProblem3n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int max = Math.max(i, j);
			int min = Math.min(i, j);
			int maximo = 0;
			int temp = 0;
			for (int j2 = min; j2 <= max; j2++) {
				maximo = Math.max(ciclo(j2), ciclo(j2 + 1));
				if (maximo > temp) {
					temp = maximo;
				}
			}
			System.out.println(i + " " + j + " " + temp);
		}
	}

	public static int ciclo(int num) {
		int contador = 1;
		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
				contador++;
			} else {
				num = (3 * num) + 1;
				contador++;
			}
		}
		return contador;
	}
}
