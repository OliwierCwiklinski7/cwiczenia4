package Zadanie;

import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();


    public void dodajWydarzenie(Wydarzenie w) {
        wydarzenia.add(w);
    }

    public void dodajWydarzenie(String nazwa, double cena, String data, String miejsce) {
        Wydarzenie w = new Wydarzenie(nazwa, cena, data, miejsce);
        wydarzenia.add(w);
    }

    public void dodajKlienta(Klient k) {
        klienci.add(k);
    }

    public void dodajklienta(String imie, String nazwisko, String email) {
        Klient k = new Klient(imie, nazwisko, email);
        klienci.add(k);
    }


    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwacje(wydarzenie);
        wydarzenie.ZarezerwujMiejsce();
    }


    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) return w;
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : klienci) {
            if (k.getNazwisko().equalsIgnoreCase(nazwisko)) return k;
        }
        return null;
    }

    public void zmienCenęWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie w = znajdzWydarzenie(nazwa);
        if (w != null) w.setCena(nowaCena);
    }
}