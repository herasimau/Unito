import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert string:");
        String inputUser = in.nextLine();
       for (int k=0; k< inputUser.length();k++ )
       {
           char c = inputUser.charAt(k);

           System.out.print((int)c + " ");
        }
        System.out.print("\n");
        System.out.print("Numero caratteri: " + inputUser.length());
        }
    }

