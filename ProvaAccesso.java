public class ProvaAccesso {
    public static void main(String[] args) {
        int scelta;

        String nomeFile = "registrazione.txt";

        Accesso accesso = new Accesso(nomeFile);

        do {
            scelta = accesso.menu();

            if (scelta == 1) {
                accesso.Registrati();
            }

            if (scelta == 3) {
                accesso.stampaUtenti();
            }

        } while (scelta != 0);

        try {
            accesso.write.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
