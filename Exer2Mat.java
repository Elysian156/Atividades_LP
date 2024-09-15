package Matriz;

import java.util.Scanner;
import java.util.Random;

public class Exer2Mat {

    public static void main(String[] args){
        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int arraySize = 2;
        int [][] matrizA = new int [arraySize][arraySize];
        int [][] matrizB = new int [arraySize][arraySize];
        int [][] matrizC = new int [arraySize][arraySize];

        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < arraySize; j++){
                matrizA[i][j] = rm.nextInt(60);
                matrizB[i][j] = rm.nextInt(60);

                System.out.printf("| %d |", matrizA[i][j]);
                System.out.printf("| %d |", matrizB[i][j]);
            }
        }
        System.out.println("\nMatriz C é: ");
        for(int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];

                System.out.printf("\n| %d |", matrizC[i][j]);
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.printf("\nTempo de execucao: %.2f", duration/ Math.pow(10, 6)  );
    }
}
