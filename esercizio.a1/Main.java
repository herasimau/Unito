import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Inserisci un numero intero: ");
        if(sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println("Hai inserito il numero: "+i);
        } else {
            System.out.println("Errore");
        }
    }
}