import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String nombre = sc.nextLine();
			String respuesta = String.valueOf(nombre.charAt(0));
			char[]nombreChar = nombre.toCharArray();
			for (int i = 0; i < nombreChar.length; i++) {
				if (nombreChar[i]=='-') {
					respuesta+=nombreChar[i+1];
				}
			}
			System.out.println(respuesta);
		}
	}
}
