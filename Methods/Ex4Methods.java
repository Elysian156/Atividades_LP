import java.util.Scanner;

public class Ex4Methods{


    public static void verificarTempo(int tempo){
        int horas = tempo / 3600;
        int minutos = (tempo%3600)/60;
        int segundos = tempo % 60;

        System.out.printf("%d segundo(s) equivalem a %d hora(s), %d minuto(s), %d segundo(s)", tempo, horas, minutos, segundos);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        verificarTempo(input);

    }
}