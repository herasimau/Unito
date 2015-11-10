public class Main {
    public static int isMax(int num, int num2){
    int max = Math.max(num, num2);
        return max;
    }
    public static void main(String[] args) {
	Display.println("Insert first number: ");
        int num = Keyboard.readInteger();
        Display.println("Insert second number: ");
        int num2 = Keyboard.readInteger();
        if(num==num2){
            Display.println("The numbers are the same");
        }
        else {Display.println("The max is: "+isMax(num,num2));}
    }
}
