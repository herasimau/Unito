
public class Main {

    public static void main(String[] args) {
        int inputAnswer;
        do
         {
            Menu.printMenu();
            inputAnswer = Keyboard.readCharacter();
            if (inputAnswer == 'a') {
                Display.println("You choose to create a new document");
            } else if (inputAnswer == 'b') {
                Display.println("You choose to open document");
            } else if (inputAnswer == 'c') {
                Display.println("You choose to save document");
            } else if (inputAnswer == 'd') {
                Display.println("You choose to send document");
            } else if (inputAnswer != 'e') {
                Display.println("Your choice is not valid");
                break;
            }
             do
                 inputAnswer = Keyboard.readCharacter();
             while (inputAnswer !='\n' );
        } while (inputAnswer !='e' );
    }
}