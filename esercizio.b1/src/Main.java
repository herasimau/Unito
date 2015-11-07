

public class Main {
    public static void main(String[] args) {

        while(true){

            Display.print("Insert H: ");
            int h = Keyboard.readInteger();
            Display.print("Insert R: ");
            int r = Keyboard.readInteger();
            Display.println("Area: "+2*Math.PI*r*(r+h));

        }

    }
}
