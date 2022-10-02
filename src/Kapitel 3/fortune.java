import java.util.Scanner;


public class fortune {
    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num < 5)
            System.out.println("Enjoy the good luck a friend brings to you.");
        else if (num < 10 && num >= 5)
            System.out.println("Your shoe selection will make you happy today");
    }
}
