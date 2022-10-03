/*Create a College Student profile containing:
    Attributes:
    - first name;
    - last name;
    - expected year to graduate;
    - GPA
    - Major
    Behaviours:
    - increment student expected year to graduate by one;
    Constructor:
    - initializes all attributes with dynamic values;
    Instances
    - Create two student profile instances.
 */
public class collegeStudent {
    String firstName;
    String lastName;
    int    graduationYear;
    double GPA;
    String major;

    public collegeStudent(String firstName, String lastName,
                          int graduationYear, double GPA,
                          String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.GPA = GPA;
        this.major = major;
    }

    public void incrementGraduationYear(){
        this.graduationYear ++;
        System.out.println("The Student " + this.firstName + " " + this.lastName + " didn't correctly enrolled himself, so his graduation day will be shifted by one year\n");
    }

    public static void main(String[] args){
        collegeStudent Rick = new collegeStudent("Rick","Zwanzig", 2024, 3.45, "information technology");
        collegeStudent Mia = new collegeStudent("Mia","Brown", 2023, 2.33, "business science");

        System.out.println(Rick.firstName + " " + Rick.lastName + " will graduate in " +  Rick.graduationYear + " with a GPA of " + Rick.GPA + " in " + Rick.major);
        Rick.incrementGraduationYear();
        System.out.println(Rick.firstName + " " + Rick.lastName + " will graduate in " +  Rick.graduationYear + " with a GPA of " + Rick.GPA + " in " + Rick.major);
        System.out.println(Mia.firstName + " " + Mia.lastName + " will graduate in " +  Mia.graduationYear + " with a GPA of " + Mia.GPA + " in " + Mia.major);


    }

}
