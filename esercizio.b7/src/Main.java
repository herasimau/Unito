public class Main {

    public static void main(String[] args) {
        int input;
        int max = 0;
        int min = Integer.MAX_VALUE;

        do
        {
            input = Keyboard.readInteger();
            if (input > max) {
                max = input;
            }
            if (input<min && input!=0)
            {
                min = input ;
            }
        }
        while (input != 0);
    Display.println("Min is: "+min+" Max is: "+max);
    }
}
