
public class MyUtilities {
    public static int maxInt(int num, int num2){
        int max = Math.max(num, num2);
        return max;
    }
    public static int minInt(int num, int num2){
        int min = Math.min(num, num2);
        return min;
    }
    public static float minFloat(float num, float num2){
        float min = Math.min(num, num2);
        return min;
    }
    public static float maxFloat(float num, float num2){
        float max = Math.max(num, num2);
        return max;
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }}

    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        }
        else {return false;}

    }
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {return false;}

    }
    public static boolean isLowerCase(char ch) {
        return Character.isLowerCase(ch);
    }
    public static boolean isUpperCase(char ch) {
        return Character.isUpperCase(ch);
    }
    public static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }
    public static boolean isWhitespace(char ch){
        return Character.isWhitespace(ch);
    }
    public static double powFloat(float a, int b)
    { return Math.pow(a,b);}
    public static double powInt(int a, int b)
    { return Math.pow(a,b);}
}
