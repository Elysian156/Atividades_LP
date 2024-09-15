
import java.util.Random;

public class Ex6Vet{

	public static void main(String[] args){
		Random random = new Random();

		int tam = 20;
		int [] VetA = new int[tam];
		int [] VetB = new int[tam];
		int i = 0;
		int x = tam - 1;
		int inter = 0;
		
		for (i = 0; i < tam; i++){
			VetA[i] = random.nextInt(50);
			VetB[i] = random.nextInt(50);
		}
		System.out.println("\nNúmeros antes da troca: ");
		System.out.println("\nArray A: ");
		for(int item : VetA){
			System.out.printf("%d, ", item);
		}
		System.out.println("\nArray B: ");
		for(int item : VetB){
			System.out.printf("%d, ", item);
		}
		
		for(i = 0;i < tam; i++){
			inter = VetA[i];
			VetA[i] = VetB[x];
			VetB[x]	 = inter;
			x--;
		}
		System.out.println("\nNúmeros trocados");
		System.out.println("Array A: ");
		for(int item : VetA){
			System.out.printf("%d, ", item);
		}
		System.out.println("\nArray B: ");
		for(int item : VetB){
			System.out.printf("%d, ", item);
		}
	}
}