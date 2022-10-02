import java.util.Scanner;

public class Student {
    public static void main(String [] args) {
        int     studentAge = 15;
        double  gpa = 3.24;
        boolean hasPerfectAttendance = true;

        String  studentFirstName = "Ruslan";
        String  studentLastName = "Rajaobelina";
        char    studentFirstInitial = studentFirstName.charAt(0);
        char    studentLastInitial = studentLastName.charAt(0);


        System.out.println(studentAge);
        System.out.println(gpa);
        System.out.println(hasPerfectAttendance);

        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        System.out.println(studentFirstName + " " + studentLastName + " has a gpa of " + gpa);

        System.out.println("What do you want to update the gpa to it to?");
        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " has a gpa of " + gpa);



    }
}
