package product;

import java.util.Scanner;

public class Product 
{
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;


    public void setItemName(String newItemName)
    {
        itemName = newItemName;
    }

    public void setTotalCost(int quantity, double price)
    {
        amountDue = quantity * price;
    }

    public String getItemName()
    {
        return itemName;
    }

    public Double getTotalCost()
    {
        setTotalCost(itemQuantity, itemPrice);
        return amountDue;
    }

    public void readInput()
    {
        try (Scanner s = new Scanner(System.in)) 
        {
            System.out.println("Enter the name of the item you are purchasing.");
            itemName = s.nextLine();

            System.out.println("Enter the quantity and price separated by a space");
            itemQuantity = s.nextInt();
            itemPrice = s.nextDouble();

            
        }
    }

    public void writeOutput()
    {
        System.out.println("You are purchasing " + itemQuantity + " " + itemName + "(s) at " + itemPrice + " each.");
    }
}
