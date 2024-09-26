import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        int a = new Scanner(System.in).nextInt();
        if(a %2 == 0 ){
            System.out.println("Your number even");
        }else {
            System.out.println("your number is not even");
        }
    }
}
