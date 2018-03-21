import java.math.BigInteger;
import java.util.Scanner;

public class ADifferentProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			BigInteger x = new BigInteger(sc.next());
			BigInteger y = new BigInteger(sc.next());
			BigInteger total = x.subtract(y);
			System.out.println(total.abs());
		}
	}
}
