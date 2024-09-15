package Matriz;

import java.util.Scanner;
import java.util.Random;

public class Exer1Mat{

	public static void main(String[] args){
		long startTime = System.nanoTime();
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		int matrizTam = 4;
		int [][] matriz = new int [matrizTam][matrizTam];
		int soma = 0;
		
		for(int i = 0; i < matrizTam; i++){
			for(int j = 0; j < matrizTam; j++){
				System.out.printf("\nDigite o valor para coluna %d e linha %d", j+1, i+1);
				matriz [i][j] = rm.nextInt(0, 60);
				System.out.printf(" | %d |", matriz[i][j]);
				soma += matriz[i][j];
			}
		}
		System.out.println("\nSoma dos valores da matriz é: " + soma);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Tempo de execução: " + duration);

	}
}