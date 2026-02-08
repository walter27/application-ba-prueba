import java.util.Arrays;
import java.util.Collections;

public class Solucion {

	public static void main(String[] args) {

		// 1. Primer solucion
		System.out.println("****************PRIMERA SOLIUCION********************");
		for (int i = 1; i <= 100; i++) {
			System.out.println(getSomosBaValue(i));
		}

		// 2. Segunda solucion
		System.out.println("****************SEGUNDA SOLIUCION*********************");
		System.out.println(sonAnagramas("ACUERDO", "ECUADOR"));
		System.out.println(sonAnagramas("roma", "amor"));
		System.out.println(sonAnagramas("hola", "ola"));
		System.out.println(sonAnagramas("java", "avaj"));
		System.out.println(sonAnagramas("casa", "saca"));

		// 3. Tercera solucion
		System.out.println("****************TERCERA SOLIUCION*********************");
		ordenarArray();

	}

	/*
	 * Metodo que inprime en pantalla los números del 1 al 100, sustituyendo los
	 * múltiplo de 3 por la palabra “SOMOS” y los múltiplo de 5 por “BA”. Para los
	 * números múltiplos de 3 y 5 a la vez sustituir con la combinación de “SOMOS
	 * BA”
	 * 
	 */
	public static String getSomosBaValue(int number) {
		boolean isMultipleOf3 = number % 3 == 0;
		boolean isMultipleOf5 = number % 5 == 0;

		if (isMultipleOf3 && isMultipleOf5) {
			return "SOMOS BA";
		} else if (isMultipleOf3) {
			return "SOMOS";
		} else if (isMultipleOf5) {
			return "BA";
		} else {
			return String.valueOf(number);
		}
	}

	/*
	 * Metodo que decida si dos String son anagramas o no
	 * 
	 */

	public static boolean sonAnagramas(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] chars1 = str1.toLowerCase().toCharArray();
		char[] chars2 = str2.toLowerCase().toCharArray();

		Arrays.sort(chars1);
		Arrays.sort(chars2);

		return Arrays.equals(chars1, chars2);
	}

	/*
	 * Metodo para ordenar de mayor a menor un arreglo
	 * 
	 */

	public static void ordenarArray() {
		Integer[] arreglo = { 50, 5, 10, 36, 25, 85, 23, 65 };
		Arrays.sort(arreglo);
		Collections.reverse(Arrays.asList(arreglo));
		System.out.println("\nArreglo ordenado descendente:");
		System.out.println(Arrays.toString(arreglo));
	}

}