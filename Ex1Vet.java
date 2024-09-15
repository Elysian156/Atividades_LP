import java.util.Random;

public class Ex1Vet {

    public static void main(String[] args){
        Random rm = new Random(0);
        
        int tam = 20;
        int[] matriz = new int[tam];
        
        for(int i = 0; i < tam; i++){
            matriz[i] = rm.nextInt();
        }
        
        for(int i = tam - 1; i >= 0; i--){
            System.out.printf("\nO numero de posicao %d tem valor: %d", i + 1, matriz[i]);
        }
    }
}
