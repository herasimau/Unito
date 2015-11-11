class Main {
    public static void main(String[] args){

        int v;
        int first;
        boolean   notFound=true;

        first=Keyboard.readInteger();

        if (first!=0){

            v=Keyboard.readInteger();
            while (v!=0 && notFound){

                if (v>first)
                    notFound=false;

                v=Keyboard.readInteger();
            }
        }

        if (notFound)
            Display.println("Non esiste nella lista un numero in valore maggiore del primo.");
        else
            Display.println("Esiste nella lista un numero in valore maggiore del primo.");
    }


}
