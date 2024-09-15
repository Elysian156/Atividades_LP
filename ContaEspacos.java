import java.util.Scanner;

public class ContaEspacos {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        int count = 0;

        for(int i = 0; i < frase.length(); i++){
           char letra = frase.charAt(i);
           if (letra == ' '){
                count++;
           }

        }
        
        System.out.printf("Esta frase possui %d espacos", count);
    }
}
