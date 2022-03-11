import product.Product;

public class Purchasing 
{
    public static void main(String[] args) throws Exception 
    {
        Product product = new Product();
        
        product.readInput();
        product.writeOutput();

        System.out.println("Amount due is " + product.getTotalCost());
    }
}
