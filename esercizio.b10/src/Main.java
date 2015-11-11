class Main {
    public static void main(String[] args){

        // DATI DI INPUT:  una lista di valori interi positivi
        // DATI DI OUTPUT: la media aritmetica dei valori

        // Definizione delle variabili

        int        v;                    // memorizza l'ultimo valore letto
        final int primo;                 // memorizza il primo numero della lista o il valore 0
        // se la lista è vuota
        boolean   tutti_non_minori=true; // variabile booelana che indica che
        // "tutti i numeri in lista sono in valore non minori del primo"

        // Testo del programma

        Display.print("Inserisci una lista di valori interi positivi anche su più linee, termina la lista con il valore 0:\n> ");

        // Quando il programma arriva ad eseguire l'istruzione che segue
        // viene sospeso se l'utente non ha ancora inserito alcuna linea.
        // Se l'utente è stato molto veloce e ha già battuto almeno una linea
        // allora la prima chiamata readInteger() restituisce il primo
        // valore intero presente nella linea.

        primo=Keyboard.readInteger(); // leggo se esiste il primo numero della lista
        // se la lista è vuota è letto il valore 0

        if (primo!=0){
            // la lista contiene almeno un valore
            v=Keyboard.readInteger();
            while (v!=0 && tutti_non_minori){

                if (v<primo)
                    tutti_non_minori=false;

                v=Keyboard.readInteger();
            }
        }

        if (tutti_non_minori)
            Display.println("Tutti i numeri della lista sono non minori del primo.");
        else
            Display.println("Esiste nella lista un numero maggiore o uguale al primo.");
    }

    /* Osservazioni:
     *
     */
}
