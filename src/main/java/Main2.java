import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        while (true) {


            int a = new Scanner(System.in).nextInt();
            if (a == 1) {
                System.out.println("today is Monday");
            }
            if (a == 2) {
                System.out.println("today is Tuesday");
            }
            if (a == 3) {
                System.out.println("today is Wednesday");
            }
            if (a == 4) {
                System.out.println("today is Thursday");
            }
            if (a == 5) {
                System.out.println("today is Friday");
            }
            if (a == 6) {
                System.out.println("today is Saturday");
            }
            if (a == 7) {
                System.out.println("today is Sunday");
            } else {
                System.out.println("you write wrong day");
            }

        }
    }
    }