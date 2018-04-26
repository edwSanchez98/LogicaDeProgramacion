
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "10001100100101111";
		StringBuilder builder = new StringBuilder(cadena);
		String cadena2 = builder.reverse().toString();
		int prueba2 = cadena2.indexOf('0');
		int prueba = cadena.indexOf('0');
		System.out.println(prueba+1);
		System.out.println(prueba2+1);
	}

}
