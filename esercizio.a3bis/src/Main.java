import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("a. New document");
            System.out.println("b. Open document");
            System.out.println("c. Save as ...");
            System.out.println("d. Mail document to...");
            System.out.println("e. Exit");

            Scanner in = new Scanner(System.in);
            System.out.println("Please make your choice (a-d): ");
            String inputUser = in.nextLine();

            if (inputUser.equals("a") || inputUser.equals("A")) {
                System.out.println("You chose to create new document");
            } else if (inputUser.equals("b") || inputUser.equals("B")) {
                System.out.println("You chose to open document");
            } else if (inputUser.equals("c") || inputUser.equals("C")) {
                System.out.println("You chose to save current document");
            } else if (inputUser.equals("d") || inputUser.equals("D")) {
                System.out.println("You chose to send via email current document");
            } else if (inputUser.equals("e") || inputUser.equals("E")) {
                break;
            } else {
                System.out.println("Errore");
            }
        }
    }
}
