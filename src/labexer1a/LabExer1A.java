package labexer1a;

public class LabExer1A 
{
    public static void main(String[] args) 
    {
        int faveNumber = 12;
        String faveCartChar = "Doraemon";
        String firstname = "Veronica";
        String lastname = "Velasquez";
        char mi = 'V';
        char [] nickNameArray = {'N', 'i', 'c', 'a'};

        System.out.println(faveNumber + " is my favorite number.");
        System.out.println("I love " + faveCartChar + "!");
        System.out.println("My name is " + firstname + " " + mi + ". " + lastname + ".");
        System.out.print("You can call me ");

        for(int i = 0; i < nickNameArray.length; i++)
        {
            System.out.print(nickNameArray[i]);
        }
        System.out.println(".");
    }
}
