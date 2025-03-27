package Zadanie;

public class Main {

    public static void main(String[] args) {

        SystemRezerwacji system = new SystemRezerwacji();

        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);

        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);

        system.dodajWydarzenie(koncert);

        system.dodajWydarzenie(teatr);

        Klient klient1 = new Klient("Jan", "Kowalski", "jan@example.com");

        Klient klient2 = new Klient("Anna", "Nowak", "anna@example.com");

        system.dodajKlienta(klient1);

        system.dodajKlienta(klient2);



        system.dokonajRezerwacji(klient1, koncert);

        system.dokonajRezerwacji(klient1, teatr);

        system.dokonajRezerwacji(klient2, koncert);



        System.out.println("Rezerwacje klienta Jan Kowalski:");

        klient1.wyswietlRezerwacje();


        Wydarzenie koncertRef = system.znajdzWydarzenie("Koncert Symphony");

        System.out.println("\nZmiana ceny koncertu na 150 zł");

        koncertRef.setCena(150.0);

        System.out.println("\nRezerwacje klienta Jan Kowalski po zmianie ceny:");

        klient1.wyswietlRezerwacje();

        System.out.println("\nRezerwacje klienta Anna Nowak po zmianie ceny:");

        klient2.wyswietlRezerwacje();


        System.out.println("\nJan anuluje rezerwację na teatr:");

        klient1.anulujRezerwacje(teatr);

        klient1.wyswietlRezerwacje();

        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostepneMiejsca()

                + " z " + koncert.getMaxLiczbaMiejsc());

    }

}
