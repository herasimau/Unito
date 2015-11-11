public class Main {

    public static void main(String[] args) {
        int count= 0;
        int sum= 0;
        int input;
        do {
            input = Keyboard.readInteger();
            if (input % 2 != 0 && input != -1) {
                sum += input;
                count++;
            }
        }while (input!=0);

         Display.println("Total odd numbers is: "+count+" The sum of this numbers is: "+sum);
    }
}
