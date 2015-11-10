
public class SumHundredOdd {
    public static boolean isEven (int num) {
        return (num & 1) == 0;
    }
    public static void main(String[] args) {
        int count =0;
        int sum =0;
        do {
            Display.println("Insert odd number: ");
            int input = Keyboard.readInteger();
            for(;!isEven(input);)
            {
                sum += input;
                count++;
                break;
            }
            for(;isEven(input);)
            {
                Display.println("Error, you need to insert odd number");
                break;
            }

        } while (count<100);
        Display.print("The sum of first 100 odd numbers is: "+sum);
    }
}
