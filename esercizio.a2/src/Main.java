import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Insserisci un solo carratere: ");
        String c = in.nextLine();


        if (c.length() > 1) {
            System.out.println("Errore");
        }
        else {
            System.out.println("Hai inserito "+c);
        }

    }
}