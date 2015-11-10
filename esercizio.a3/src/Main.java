

public class Main {

    public static void main(String[] args) {

        Menu.printMenu();
        int inputAnswer = Keyboard.readCharacter();
        switch (inputAnswer){
            case 'a': Display.print("You choose to create a new document");
                break;
            case 'b': Display.print("You choose to open document");
                break;
            case 'c': Display.print("You choose to save document");
                break;
            case 'd': Display.print("You choose to send document");
                break;
                default: Display.print("Error. You can choose from a to d");
        }

    }
}
