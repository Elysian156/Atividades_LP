import java.util.Scanner;

public class Ex5Methods {

    public static StringBuffer emitirConceito(int media){
        StringBuffer conceito = new StringBuffer();

        if(0 <= media && media <= 4.9){
            conceito.append("Conceito D");
        }
        else if(5<= media && media <= 6.9){
            conceito.append("Conceito C");
        }
        else if(7 <= media && media <= 8.9){
            conceito.append("Conceito B");
        }
        else if(9 <= media && media <= 10){
            conceito.append("Conceito A");

        }   
        return conceito;

     }

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int notaFinal = sc.nextInt();
        System.out.println(emitirConceito(notaFinal));

     }
}
