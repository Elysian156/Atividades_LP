import java.util.Scanner;
public class Npalavras {
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int wordsNum = sc.nextInt();
    char startLetter = sc.next().toUpperCase().charAt(0);
    int count = 0;
    String[] words = new String[50];

    for(int i = 0; i < wordsNum; i++){
        String word = sc.next().toUpperCase();
        if(word.charAt(0) == startLetter){
            words[count] = word;
            count++;
        }
    }

    System.out.printf("%nAs palavras que comecam com: %c%n", startLetter);
    int j = 0;
    while(words[j] != null){
        System.out.println(words[j]);
        j++;
    }

}
}
