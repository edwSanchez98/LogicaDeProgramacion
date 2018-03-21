import java.util.Scanner;

public class faktor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int artcount = sc.nextInt();
			int impfactor = sc.nextInt() - 1;
			System.out.println(artcount * impfactor + 1);
		}
	}
}
