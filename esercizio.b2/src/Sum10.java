import java.util.ArrayList;

public class Sum10 {

    public static void main(String[] args) {
        ArrayList<Integer> inputList =new ArrayList<Integer>();

        for(int i =0;i<10;i++) //Primi 10 numeri
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
