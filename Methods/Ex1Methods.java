import java.util.Scanner;

public class Ex1Methods{

	public static void verificarValor(int val){
		if(val % 2 == 0){
			System.out.println("O valor e par");
		}else if(val % 2 ==1) {
			System.out.println("O valor e impar");			
		}
		return;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		verificarValor(valor);
	
	}
	
}