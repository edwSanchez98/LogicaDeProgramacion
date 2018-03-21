import java.util.Scanner;

public class rimski {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String numRomano = sc.nextLine();
			switch (numRomano) {
			case "VI":
				System.out.println("IV");
				break;
			case "XI":
				System.out.println("IX");
				break;
			case "XVI":
				System.out.println("XIV");
				break;
			case "XXI":
				System.out.println("XIX");
				break;
			case "XXVI":
				System.out.println("XXIV");
				break;
			case "XXXI":
				System.out.println("XXIX");
				break;
			case "XXXVI":
				System.out.println("XXXIV");
				break;
			case "XLVI":
				System.out.println("XLIV");
				break;
			case "LVI":
				System.out.println("LIV");
				break;
			case "LXI":
				System.out.println("XLI");
				break;
			case "LXII":
				System.out.println("XLII");
				break;
			case "LXIII":
				System.out.println("XLIII");
				break;
			case "LXIV":
				System.out.println("XLIV");
				break;
			case "LXV":
				System.out.println("XLV");
				break;
			case "LXVI":
				System.out.println("XLIV");
				break;
			case "LXVII":
				System.out.println("XLVII");
				break;
			case "LXVIII":
				System.out.println("XLVIII");
				break;
			case "LXIX":
				System.out.println("XLIX");
				break;
			case "LXXI":
				System.out.println("XLIX");
				break;
			case "LXXVI":
				System.out.println("LXXIV");
				break;
			case "LXXXI":
				System.out.println("LXXIX");
				break;
			case "LXXXVI":
				System.out.println("LXXXIV");
				break;
			case "XCVI":
				System.out.println("XCIV");
				break;
			default:
				System.out.println(numRomano);
			}
		}

	}

}
