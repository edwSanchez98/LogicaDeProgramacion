import java.util.Scanner;

public class BatterUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double cases = sc.nextInt();
			double temp = cases;
			double acumulador = 0;
			for (int i = 0; i < cases; i++) {
				double num = sc.nextInt();
				if (num>=0) {
					acumulador+=num;
				}else {
					temp--;
				}
			}
			String total = String.format("%.13f", acumulador/temp);
			char c = ',';
			char[] cadena = total.toCharArray();
			String totalCompleto="";
			for (char v : cadena) {
				if (c==v) {
					totalCompleto += '.';
				}else{
					totalCompleto += v;
				}
			}
			System.out.println(totalCompleto);			
		}
	}
}
