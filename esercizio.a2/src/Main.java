
public class Main
{
    public static void main (String[] args)
    {
        int input;
        Display.println("Insert one char: ");
        input = Keyboard.readCharacter();
        Display.println("You have insert: " +(char)input);
        Display.print("Int value for "+(char)input+" is "+input);
    }
}