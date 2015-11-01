import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert string:");
        String string = in.nextLine();
        StringBuilder result = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            result.setCharAt(i, ch >= 'A' && ch <= 'Z' ? (char) (ch + 'a' - 'A') : ch);
        }
        System.out.println(result);

    }
}
