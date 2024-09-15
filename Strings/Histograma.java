import java.util.Scanner;
public class Histograma {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        System.out.printf("Linha de texto: %s", frase);
        String fraseMaiuscula = frase.toUpperCase();
        
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for(int i = 0; i < frase.length(); i++){
            char letra = fraseMaiuscula.charAt(i);
            switch(letra){

                case 'A':
                    countA++;
                    break;
                case 'E':
                    countE++;
                    break;
                case 'I':
                    countI++;
                    break;
                case 'O':
                    countO++;
                    break;
                case 'U':
                    countU++;
                    break;

            }
        }
        System.out.println("Histograma: ");
        System.out.printf("a: " + "*".repeat(countA) + "(%d)%n", countA);
        System.out.printf("e: " + "*".repeat(countE) + "(%d)%n", countE);
        System.out.printf("i: " + "*".repeat(countI) + "(%d)%n", countI);
        System.out.printf("o: " + "*".repeat(countO) + "(%d)%n", countO);
        System.out.printf("u: " + "*".repeat(countU) + "(%d)%n", countU);

    }
    
}
