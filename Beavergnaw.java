import java.util.Scanner;

public class Beavergnaw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		double v = sc.nextDouble();
		while(d!=0&&v!=0) {	
			System.out.println(Math.cbrt( (((-6) * v) / Math.PI) + (d*d*d)));
			d = sc.nextDouble();
			v = sc.nextDouble();				
		}			
	}
}
