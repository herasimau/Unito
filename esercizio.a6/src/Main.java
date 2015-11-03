import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String si = "s";
        String no = "n";
        Scanner in = new Scanner(System.in);
        ArrayList answers = new ArrayList(); //Salvare risposta qui
        String questions [] = {"Hai svolto tutti i tuoi compiti a casa?","E' venerdi?","Ce' qualcosa interessante alla TV",
                "Sta piovendo?" }; //Tutte le domande
        for (int i=0;i<questions.length;i++) { //Loop per le domande
            System.out.println(questions[i]);

            boolean inputIsOk = false;
            while (!inputIsOk) {
                try {
                    String answer = in.nextLine();
                    if (answer.equals(si) || answer.equals(no))
                    {
                        inputIsOk = true;
                        answers.add(answer);
                    }
                    else { System.out.println("Puoi rispondere solo s o n");
                    }
                } catch (NumberFormatException error)
                        {error.getMessage();}
            }
        }

            if (answers.get(0).equals(si) && answers.get(1).equals(si) && answers.get(2).equals(no) && answers.get(3).equals(no)) {
                System.out.println("Puoi uscire"); //Controllo se le risposte corrispondono a schema s,s,n,n
            } else {
                System.out.println("Non puoi uscire");
            }

    }
}
