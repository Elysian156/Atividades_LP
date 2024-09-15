import java.util.Scanner;

public class Ex3Methods {

	public static float calcularMedia(float nota1, float nota2, char calc) {
		Character.toUpperCase(calc);
		float resultado = 0;

		if (calc == 'A') {
			resultado = (nota1 + nota2) / 2;
		} else if (calc == 'P') {
			resultado = (7 * nota1 + 3 * nota2) / 10;
		}

		return resultado;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float val1 = sc.nextFloat();
		float val2 = sc.nextFloat();
		char param = sc.next().charAt(0);
		String tipoMedia = "";

		float media = calcularMedia(val1, val2, param);

		if (param == 'A') {
			tipoMedia = "Aritmetica";

		} else if (param == 'P') {
			tipoMedia = "Ponderada";

		}

		System.out.printf("A media %s do aluno e: %.2f", tipoMedia, media);
	}
}