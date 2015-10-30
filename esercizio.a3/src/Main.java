import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("a. New document");
        System.out.println("b. Open document");
        System.out.println("c. Save as ...");
        System.out.println("d. Mail document to...");

        Scanner in = new Scanner(System.in);
        System.out.println("Please make your choice (a-d): ");
        String c = in.nextLine();
        if (Objects.equals(c, "a") || Objects.equals(c, "A")){
            System.out.println("You chose to create new document");
        }
        else if (Objects.equals(c, "b") || Objects.equals(c, "B")){
            System.out.println("You chose to open document");
        }
        else if (Objects.equals(c, "c") || Objects.equals(c, "C")){
            System.out.println("You chose to save current document");
        }
        else if (Objects.equals(c, "d") || Objects.equals(c, "D")){
            System.out.println("You chose to send via email current document");
        }
        else {
            System.out.println("Errore");
        }

    }
}
