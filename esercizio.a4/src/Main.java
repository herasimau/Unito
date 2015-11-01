import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert string:");
        String string = in.nextLine();
       for (int k=0; k< string.length();k++ )
       {
           char c = string.charAt(k);

           System.out.print((int) c + " ");
        }
        System.out.print("\n");
        System.out.print("Numero caratteri: " + string.length());
        }
    }

