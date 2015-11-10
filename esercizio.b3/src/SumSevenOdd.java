
public class SumSevenOdd {
    public static boolean isEven (int num) {
        return (num & 1) == 0;
    }
    public static void main(String[] args) {
        int count =0;
        int sum =0;
        int input;
        do {
            Display.println("Insert odd number: ");
            input = Keyboard.readInteger();
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

        } while (count<7 && input!=-1);
        switch (count){
            case 4: Display.print("The sum of first 7 odd numbers is: " + sum);}
    }
}
