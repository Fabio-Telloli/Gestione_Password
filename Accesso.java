import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Accesso {
    Scanner scanner;
    FileWriter write;
    LinkedList<Utente> utenti = new LinkedList<Utente>();

    Accesso(String nomeFile) {
        try {
            write = new FileWriter(nomeFile);
        } catch (Exception e) {
            System.out.println("errore nel creare il file");
        }
        
        scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("#######################");
        System.out.println("#                     #");
        System.out.println("#   1. Registrati     #");
        System.out.println("#   2. Accesso        #");
        System.out.println("#                     #");
        System.out.println("#######################");
    }

    public void Registrati() {

        try {
            System.out.println("inserisci la tua email: ");
            String email = scanner.nextLine();

            System.out.println("inserisci la tua passworld: ");
            String pass = scanner.nextLine();

            Utente nuovoUtente = new Utente(email, pass);  //nuono utente
            utenti.add(nuovoUtente);                       //aggiunge l'utente alla linkedlist

            write.write("email: " + email + "  " + "passworld: " + pass);  // salva utente nel file

            write.write("email: " + email);
            write.close();
        } catch (Exception e) {
            System.out.println("impossibile creare il file");
        }

        
        
    }
}
