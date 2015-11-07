import java.util.ArrayList;

public class SumN {

    public static void main(String[] args) {
        ArrayList<Integer> inputList =new ArrayList<>();
        Display.println("Insert N: ");
        int n = Keyboard.readInteger();
        for(int i =0;i<n;i++) // N numeri,
        {
            int someInt = Keyboard.readInteger();
            inputList.add(someInt);
        }
        int sum=0;
        for(int i: inputList) {
            sum += i;
        }
        Display.println(sum);
    }}
