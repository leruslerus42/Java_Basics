import java.util.Scanner;

public class multipleChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which is the Capital of the USA? \n");
        System.out.println("1) New York");
        System.out.println("2) Los Angeles");
        System.out.println("3) Washington");

        int userAnswer = input.nextInt();

        while (userAnswer < 1 || userAnswer > 3) {
            System.out.println(" Please provide a number between 1, 2 or 3");
            userAnswer = input.nextInt();
        }

        if (userAnswer == 3)
            System.out.println("Congratulations: Correct answer!");
        else if (userAnswer == 1 || userAnswer == 2)
               System.out.println("Unfortunately the answer that you provided is not correct. The right answer is Washington at number 3");



    }
}
