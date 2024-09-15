import java.util.Random;

public class Ex7Vet {

    public static void main(String[] args){
        Random rd = new Random();
        int tam = 30;
        int A[] = new int[tam];
        int B[] = new int[tam];
        int aux = 0;

        for(int i = 0; i < tam; i++) {
            aux = rd.nextInt(100);
            if(aux%5 == 0){
                A[i] = aux;
            }
        }
        System.out.println("Array A: " + "\n");
        for(int item : A){
            System.out.printf("%d |" + item);
        }
        System.out.printf("Estes foram os números nao divisiveis por 5: ");
    }
}
