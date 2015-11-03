import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert string:");
        String inputUser = in.nextLine();
        StringBuilder result = new StringBuilder(inputUser);
        for (int i = 0; i < inputUser.length(); i++) {
            char ch = inputUser.charAt(i);
            result.setCharAt(i, ch >= 'A' && ch <= 'Z' ? (char) (ch + 'a' - 'A') : ch);
        }
        System.out.println(result);

    }
}