/*
    REQUIREMENTS
    INPUTS: number of hours the employee works per week, amount of money the employee makes per hour, number of vacation days (not paid)
    OUTPUT: employee early salary

*/

import java.util.Scanner;

public class employeeSalary {
    public static int calculateEmployeeSalary(int weeklyHours, int hourlyWage, int vacationDays) {
        if (weeklyHours < 0 || hourlyWage < 0)
            return (-1);




        int result = (weeklyHours * 52 * hourlyWage) - (vacationDays * 8 * hourlyWage);
        return (result);
    }


    public static void main(String[] args)
    {
        int weeklyHours, hourlyWage, vacationDays;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weekly hours: ");
        weeklyHours = input.nextInt();
        System.out.println("Enter the hourly wage: ");
        hourlyWage = input.nextInt();
        System.out.println("Enter the number of vacation days: ");
        vacationDays = input.nextInt();

        int yearlySalary = calculateEmployeeSalary(weeklyHours, hourlyWage, vacationDays);
        System.out.println(yearlySalary);
    }
}
