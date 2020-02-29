import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String word;
        word = scanner.nextLine();

        if ((word.length()/2)*2 == word.length()){
            System.out.println("String is even!");
        }else{
            System.out.println("String is not even!");
        }
    }
}
