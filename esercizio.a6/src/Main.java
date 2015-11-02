import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String si = "s";
        String no = "n";
        ArrayList answers = new ArrayList(); //Salva risposta qui
        String questions [] = {"Hai svolto tutti i tuoi compiti a casa?","E' venerdi?","Ce' qualcosa interessante alla TV",
                "Sta piovendo?" }; //Tutti domande
        for (int i=0;i<questions.length;i++){ //Per non ripetre ogni volta ho fatto for loop
            Scanner in = new Scanner(System.in);
            System.out.println(questions[i]);
            String k = in.nextLine();
            if(!k.equals(si)&&!k.equals(no)) //Controllo se utente inserisce un carattere diverso da s or n, stampa errore e esci dal lopp
            {
                System.out.println("you can answer only s or n");break;
            }
            else if (!k.equals(si)){ //Se utente ha risposto s, aggiungo in Arraylist di risposte

                answers.add("s");

            }
            else if (!k.equals(no)){ //Se utente ha risposto n, aggiungo in Arraylist di risposte

                answers.add("n");

            }
        }

        int a = answers.size(); //La grandezza di risposte

       if(a==4) //Se la grandezza e' uguale a 4 andiamo avanti, altrimenti terminiamo il programma
        {
            Collections.reverse(answers);// Mettiamo le risposte in ordine
            if (answers.get(0) == si && answers.get(1) == si && answers.get(2) == no && answers.get(3) == no) {
                System.out.println("Puoi uscire"); //Controllo se risposte corrispondono a schema s,s,n,n
            } else {
                System.out.println("Non puoi uscire");
            }

        }
        else {System.exit(0);}


    }
}
