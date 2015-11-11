class Main {
    public static void main(String[] args){

        int        v;
        final int primo;
        boolean   tutti_non_minori=true;

        primo=Keyboard.readInteger();
        if (primo!=0){

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

}
