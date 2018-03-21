import java.util.Scanner;

public class Domino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int size = sc.nextInt();
			int inicio = 0, multiplo = 0,total=0;
			for (int i = 0; i < size; i++) {
				multiplo += 3;
				inicio += multiplo;				
				total+= inicio;
			}
			System.out.println(total);
		}
	}
}
