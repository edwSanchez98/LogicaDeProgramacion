import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BaconEggsAndSpam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		while (cases != 0) {
			HashMap<String, String> lista = new HashMap<>();
			for (int i = 0; i < cases; i++) {
				String cadena = sc.nextLine();
				char[] cadenaChar = cadena.toCharArray();
				String nombre = "";
				int bandera = 0;
				for (int j = 0; j < cadenaChar.length; j++) {
					if (Character.isAlphabetic(cadenaChar[j])) {
						nombre = nombre + cadenaChar[j];
					} else {
						bandera = j + 1;
						break;
					}
				}
				String temporal = "";
				for (int j = bandera; j < cadenaChar.length; j++) {
					if (cadenaChar[j] == ' ') {
						if (lista.containsKey(temporal)) {
							lista.replace(temporal, lista.get(temporal), lista.get(temporal) + " " + nombre);
						} else {
							lista.put(temporal, nombre);
						}
						temporal = "";
					} else {
						temporal = temporal + cadenaChar[j];
					}
				}
				if (lista.containsKey(temporal)) {
					lista.replace(temporal, lista.get(temporal), lista.get(temporal) + " " + nombre);
				} else {
					lista.put(temporal, nombre);
				}
			}
			Iterator it = lista.entrySet().iterator();
			ArrayList listaClaves = new ArrayList();
			while (it.hasNext()){
				List<String> nom = new ArrayList<>();
				Map.Entry entrada = (Map.Entry)it.next();
				listaClaves.add(entrada.getKey());
				String temporal = "";
				String nombresOrdenados = (String)entrada.getValue();
				char[] nombre = nombresOrdenados.toCharArray();
				for (int i = 0; i < nombre.length; i++) {
					if (nombre[i] == ' ') {						
							nom.add(temporal);						
						temporal = "";
					} else {
						temporal = temporal + nombre[i];
					}
				}
				nom.add(temporal);
				Collections.sort(nom);
				String prueba = "";
				for (int i = 0; i < nom.size(); i++) {
					prueba += nom.get(i) + " ";
				}
				lista.replace((String)entrada.getKey(), lista.get(entrada.getKey()), prueba);
			}
			
			Collections.sort(listaClaves);	// Ordenamos el ArrayList de claves			
			
			//Mostrar el Mapa Ordenado
			listaClaves.stream().forEach(clave -> System.out.println(clave + " " + lista.get(clave)));
			System.out.println();
			cases = sc.nextInt();
			sc.nextLine();
		}
	}
}
