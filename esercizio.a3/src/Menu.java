
public class Menu {
    private Menu(){}
    public static void printMenu()
    {
        Display.println("a. New document");
        Display.println("b. Open document");
        Display.println("c. Save as ...");
        Display.println("d. Mail document to...");
        Display.println("Please make your choice (a-d): ");
    }

}
