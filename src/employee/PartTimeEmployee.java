package employee;

public class PartTimeEmployee extends Employee
{
    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    public PartTimeEmployee(double ratePerHour, int hoursWorked)
    {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        setWage();
    }

    public void setWage()
    {
        wage = ratePerHour * hoursWorked;
    }

    public double getWage()
    {
        return wage;
    }


}
