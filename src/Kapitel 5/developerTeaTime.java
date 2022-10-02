import java.util.Scanner;

public class developerTeaTime {

    public static void announceDeveloperTeaTime(){
        System.out.print("Waiting for developer tea time ...");
        System.out.println("Press a random world to start the developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.print("\nIt's developer tea time :D");
    }


    public static void main(String[] args){
        announceDeveloperTeaTime();

    }
}
