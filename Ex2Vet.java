import java.util.Random;

public class Ex2Vet{

    public static void main(String[] args){
        Random rm = new Random();

        int tam = 15;
        int [] matriz = new int [tam];
        int [] tri = new int [tam];

        for(int i = 0; i < tam; i++){
            matriz[i] = rm.nextInt(0, 50);
            System.out.printf("\nO valor de %d e: %d", i + 1, matriz[i]);
        }

        for(int i = 0; i < tam; i++){
            tri[i] = matriz[i] * 3;
            System.out.printf("\nO numero de %d da nova matriz e: %d", i + 1, tri[i]);
        }
    }
}
