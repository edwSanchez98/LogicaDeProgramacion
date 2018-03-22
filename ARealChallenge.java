import java.util.Scanner;

public class ARealChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double x = sc.nextDouble();
			String total = String.format("%.16f", Math.sqrt(x)*4);		
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
