import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Accesso {
    Scanner scanner;
    PrintWriter write;
    int scel;
    LinkedList<Utente> utenti = new LinkedList<Utente>();

    Accesso(String nomeFile) {
        try {
            write = new PrintWriter(new FileWriter(nomeFile, true));
        } catch (Exception e) {
            System.out.println("errore nel creare il file");
        }        
        scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("#######################");
        System.out.println("#                     #");
        System.out.println("#   1. Registrati     #");
        System.out.println("#   2. Accesso        #");
        System.out.println("#                     #");
        System.out.println("#######################");

        System.out.println("cosa vuoi fare: ");
        scel = scanner.nextInt();
        scanner.nextLine();
        return scel;
    }

    public void Registrati() {

        try {
            System.out.println("inserisci la tua email: ");
            String email = scanner.nextLine();

            System.out.println("inserisci la tua passworld: ");
            String pass = scanner.nextLine();

            Utente nuovoUtente = new Utente(email, pass);                   //nuono utente
            utenti.add(nuovoUtente);                                        //aggiunge l'utente alla linkedlist


            write.write("email: " + email + "  " + "passworld: " + pass + " ") ;  // salva utente nel file
            
        } catch (Exception e) {
            System.out.println("impossibile creare il file");
        }
    }

    public void stampaUtenti() {
        System.out.println("Contenuto della LinkedList di Utenti:");
        System.out.println("Numero di utenti nella LinkedList: " + utenti.size());
        for (Utente utente : utenti) {
            System.out.println(utente);
        }
    }

    public void chiudiFile() {
        try {
            write.close();
        } catch (Exception e) {
            System.out.println("non è stato possibile chiudere il file");
        }
    }
}
