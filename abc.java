import java.util.Arrays;
import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int[] numeros = {sc.nextInt(),sc.nextInt(),sc.nextInt()};			
			sc.nextLine();
			String cadena = sc.nextLine();
			Arrays.sort(numeros);			
			int a = numeros[0], b = numeros[1], c = numeros[2];			
			char[] cad = cadena.toCharArray();
			String total = "";			
			if (String.valueOf(cad[0]).equalsIgnoreCase("a")) {
				total += a+" "; 
			}else if(String.valueOf(cad[0]).equalsIgnoreCase("b")) {
				total += b+" ";
			}else{
				total += c+" ";
			}
			if (String.valueOf(cad[1]).equalsIgnoreCase("a")) {
				total += a+" "; 
			}else if(String.valueOf(cad[1]).equalsIgnoreCase("b")) {
				total += b+" ";
			}else{
				total += c+" ";
			}
			if (String.valueOf(cad[2]).equalsIgnoreCase("a")) {
				total += a+" "; 
			}else if(String.valueOf(cad[2]).equalsIgnoreCase("b")) {
				total += b+" ";
			}else{
				total += c+" ";
			}
			System.out.println(total);		
		}
	}	
}
