import java.util.ArrayList;

public class Sum100 {

    public static void main(String[] args) {
        ArrayList<Integer> inputList =new ArrayList<Integer>();

        for(int i =0;i<100;i++) //Primi 100 numeri,
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
