public class Main {

    public static void main(String[] args) {
             int c;
             int  sum =0;
             int count =0;
        do
    {
        c = Keyboard.readInteger();
        sum += c;
        count++;
    }
    while (c != 0);
    int med = sum/(count-1);
        Display.println("sum is "+sum+" med is "+med);
    }
}
