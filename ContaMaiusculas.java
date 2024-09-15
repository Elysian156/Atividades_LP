import java.util.Scanner;

public class ContaMaiusculas {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        int count = 0;

        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(Character.isUpperCase(letra) == true){
                count++;
            }
        }

        System.out.printf("O numero de maiusculas na frase e: %d", count);
    }
}
