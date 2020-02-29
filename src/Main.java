import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String word, reverse = "";
        word = scanner.nextLine();
        int length = word.length();
        for (int i = length -1; i >=0; i--)
            reverse = reverse + word.charAt(i);
        if (word.equals(reverse)){
            System.out.println("This string is a palindrome");
        } else {
            System.out.println("This string is not a palindrome");
        }
    }
}
