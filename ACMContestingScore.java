import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMContestingScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String numero = sc.next();
			List<String> cadena = new ArrayList<>();
			while (!(numero.equals("-1"))) {
				String word = sc.next() + sc.next();
				cadena.add(numero);
				cadena.add(word);
				numero = sc.next();
			}
			int sumaTotal = 0;
			int cont = 0;
			for (int i = 1; i < cadena.size();) {
				String temp = (String) cadena.get(i);
				if (temp.charAt(1) == 'r') {
					sumaTotal += Integer.parseInt((String) cadena.get(i - 1));
					sumaTotal += sumaRespuestas(cadena, temp.charAt(0));
					cont++;
				}
				i += 2;
			}
			System.out.println(cont + " " + sumaTotal);
		}
	}

	public static int sumaRespuestas(List score, char x) {
		int suma = 0;
		for (int i = 1; i < score.size();) {
			String temp = (String) score.get(i);
			if (temp.charAt(0) == x && temp.charAt(1) != 'r') {
				suma += 20;
			}
			i += 2;
		}
		return suma;
	}
}
