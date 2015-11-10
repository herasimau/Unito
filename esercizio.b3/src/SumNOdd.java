
public class SumNOdd {
    public static boolean isEven (int num) {
        return (num & 1) == 0;
    }
    public static void main(String[] args) {
        int count =0;
        int sum =0;
        Display.println("Insert how much odd numbers you want to sum: ");
        int n  = Keyboard.readInteger();
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

        } while (count<n);
        Display.print("The sum of first "+n+" odd numbers is: "+sum);
    }
}
