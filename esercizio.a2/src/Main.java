import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Insserisci un solo carratere: ");
        String inputUser = in.nextLine();


        if (inputUser.length() > 1 || inputUser.isEmpty() )
        {
            System.out.println("Errore");
        }
        else
        {
            System.out.println("Hai inserito "+inputUser);
        }

    }
}