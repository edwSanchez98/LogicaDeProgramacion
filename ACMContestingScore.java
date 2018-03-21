import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ACMContestingScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int numero = sc.nextInt();	
			sc.nextLine();
			HashMap<Integer, String> score = new HashMap<>();
			while(numero!=-1) {						
				String letra = sc.nextLine();
				String rOrW = sc.nextLine();
				String cadena = letra+rOrW;
				score.put(numero, cadena);								
				numero = sc.nextInt();
				sc.nextLine();				
			}
			Map mapOrdenado = new TreeMap(score);
			Set ref = mapOrdenado.keySet();
			Iterator it = ref.iterator();
			System.out.println(mapOrdenado);
		}		
	}
	
	public static int resultado(Map mapOrden, int x) {
		for (int i = 0; i < mapOrden.size(); i++) {
			
		}
		return 0;
	}
}
