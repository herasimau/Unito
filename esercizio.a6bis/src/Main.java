import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String si = "s";
        String no = "n";
        ArrayList<String> answers = new ArrayList<>(); // Salvare rispote qui
        Scanner in = new Scanner(System.in);
        String questions[] = { "Hai fatto tutti i tuoi compiti?", "E' venerdi?", "Ce' qualcosa interessante alla TV?", "Sta piovendo?",
                "Quanti soldi hai(no centesimi)?" }; // Tutte le domande
        for (int i = 0; i < questions.length; i++) { //Loop per le domande
            System.out.println(questions[i]);

            // Si/No
            if (i < 4) {
                boolean inputIsOk = false;
                while (!inputIsOk) {
                    String answer = in.nextLine();
                    if (answer.equals(si) || answer.equals(no)) {
                        inputIsOk = true;
                        answers.add(answer);
                    } else {
                        System.out.println("Puoi rispondere solo s o n");
                    }
                }
            } else { // Quinta domanda.
                boolean inputIsOk = false;
                while (!inputIsOk) {
                    try {
                        String answer = in.nextLine();
                        int money = Integer.parseInt(answer);
                        if (money < 0) {
                            System.out.println("Puoi solo inserire un numero positivo");
                        } else {
                            inputIsOk = true;
                            if (money >= 20) {
                                answers.add(si);
                            } else {
                                answers.add(no);
                            }
                        }
                    } catch (NumberFormatException error) {
                        System.out.println("Puoi inserire solo i numeri int. " + error.getMessage());
                    }
                }
            }

        }

        if (answers.get(0).equals(si) && answers.get(1).equals(si) && answers.get(2).equals(no) && answers.get(3).equals(no) && answers.get(4).equals(si)) {
            System.out.println("Si, puoi uscire"); // Controllo risposte
            // se corrisponde schema s,s,n,n,s
        } else {
            System.out.println("Non puoi uscire");
        }

    }

    }

