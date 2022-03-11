import java.util.Scanner;

import employee.FullTimeEmployee;
import employee.PartTimeEmployee;

public class RunEmployee 
{
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);

        String name = new String();
        
        System.out.println("Enter name:");
        name = s.nextLine();

        System.out.println("Press F for Full Time or P for Part Time");
        char choice = s.nextLine().charAt(0);

        if (choice == 'F')
        {
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
            fullTimeEmployee.setName(name);

            System.out.println("Enter Monthly Salary:");
            double salary = s.nextDouble();

            fullTimeEmployee.setMonthlySalary(salary);

            System.out.println("Name: " + fullTimeEmployee.getName());
            System.out.println("Monthly Salary: " + fullTimeEmployee.getMonthlySalary());
        }
        else
        {
            System.out.println("Enter rate per hour and no. of hours worked separated by space");
            double ratePerHour = s.nextDouble();
            int hoursWorked  = s.nextInt();

            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(ratePerHour, hoursWorked);
            partTimeEmployee.setName(name);

            System.out.println("Name: " + partTimeEmployee.getName());
            System.out.println("Wage: " + partTimeEmployee.getWage());
        }

        s.close();
    }

}
