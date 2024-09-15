package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Exer3Mat{

	public static void main(String[] args){
		
		Random rm = new Random();
		
		int arraySize = 8;
		int [][] matriz = new int [arraySize][arraySize];
		
		for(int i = 0; i < arraySize; i++){
			for(int j = 0; i < arraySize; j++){

						
				System.out.printf("| %d |", matriz[i][j]);
				}
			}
		
		}
		
	}