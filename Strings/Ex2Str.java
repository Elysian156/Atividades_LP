import java.util.Scanner;

public class Ex2Str {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		int count = 0;
		String maiusculas = nome.toUpperCase();
		String minusculas = nome.toLowerCase();

		for (int i = 0; i < nome.length(); i++) {

			if (nome.charAt(i) == 'a' || nome.charAt(i) == 'e' || nome.charAt(i) == 'i' || nome.charAt(i) == 'o'
					|| nome.charAt(i) == 'u') {
				count++;
			}
		}

		System.out.printf("O nome e: %s%n e o num de vogais e: %d", nome, count);

	}
}