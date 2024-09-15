package Matriz;

import java.util.Scanner;

public class Exer6Mat {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int ord = 3;
		int [][] matriz = new int [ord][ord];
		
		for(int i = 0; i < ord; i++){
			for(int j = 0 ; j < ord; j++){
			System.out.printf("\nDigite o valor da coluna %d na linha %d\n", j+1, i+1);
				matriz[i][j] = sc.nextInt();
			}
		}

		int dp = 0;
		int demais = 0;

		for(int i = 0; i < ord; i++) {
			for (int j = 0; j < ord; j++) {
				if (i == j) {
					dp += matriz[i][j];

				} else {
					demais += matriz[i][j];
				}
			}
		}

		System.out.println("Matriz de entrada ");
		for(int[] line : matriz) {
			System.out.print("|");
			for(int cell : line) {
				System.out.printf("%d|",cell);
			}
			System.out.println(" ");
		}

		if(dp == ord && demais == 0){
			System.out.println("É uma matriz identidade");
		}
		else {
			System.out.println("Não é identidade");
		}
	}
}