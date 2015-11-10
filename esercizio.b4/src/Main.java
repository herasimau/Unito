public class Main {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
	Display.println("Insert year: ");
        int year = Keyboard.readInteger();
        Display.println("The year "+year+" is leap "+isLeapYear(year));
    }
}
