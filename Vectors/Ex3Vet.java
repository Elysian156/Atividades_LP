import java.util.Random;

public class Ex3Vet {
    
    public static void main(String[] args) {

        Random rm = new Random();

        int tam = 50;
        int [] matriz = new int [tam];
        int subNumber = 0;

        for(int i = 0; i < tam; i++){
            matriz[i] = rm.nextInt(0, 50);
            System.out.println(matriz[i]);
            if(subNumber < matriz[i]){
                subNumber = matriz[i];
            }else{
                continue;
            }
        }
        System.out.printf("O maior numero e: %d", subNumber);
        
    }
}
