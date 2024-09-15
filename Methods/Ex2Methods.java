import java.util.Scanner;

public class Ex2Methods{

	public static void somarValores(int val1, int val2){
		int resultado = 0;
		
		resultado = val1 + val2;
		
		System.out.printf("A soma dos valores e: %d", resultado);
		return;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		somarValores(n1,n2);
		
	}
}