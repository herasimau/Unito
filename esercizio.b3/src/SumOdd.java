
public class SumOdd {

    public static void main(String[] args) {
        int count =0;
        int sum =0;
        for(;count<4;)
        {
            Display.println("Insert odd number: ");
            int input = Keyboard.readInteger();
            if (input%2!=0&&input!=-1)
            {
                sum +=input;
                count++;
            }
            else if (input==-1)
            {
                Display.println("You choose to exit");
                break;
            }
            else if(input%2==0)
            {
                Display.println("Error. You need to insert odd number");
            }
        }
        if(count==4) { Display.println("The sum of 4 odd numbers is "+sum); }
    }
}
