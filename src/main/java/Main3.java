import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Enter your word");
        String word = new Scanner(System.in).nextLine();
        System.out.println("Enter your letter:");
        String letter = new Scanner(System.in).next();
        if (word.contains(letter)) {
            System.out.println("your word is rare");
        }else {
            System.out.println("Your letter not found");
        }
    }
}