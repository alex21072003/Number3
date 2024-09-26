import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your flowers");
            String flower = new Scanner(System.in).nextLine();
            System.out.println("Enter your color");
            String color = new Scanner(System.in).nextLine();
            if(flower.equals("Розы")&& color.equals("Белый")|| color.equals("Синий")){
                System.out.println("That flowers love Polina!");
            }else{
                System.out.println("This flowers Polina don't like");
            }
        }
    }
}