package Zadanie;

public class Wydarzenie {
    private String  nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa,cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena,data);
        this.miejsce = miejsce;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getData() {
        return data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String toString() {
        return "Wydarzenie: " + nazwa + "\n" +
                "Data: " + getData() + "\n" +
                "Miejsce: " + miejsce + "\n" +
                "Cena: " + cena + " PLN\n" +
                "Dostępne miejsca: " + dostepneMiejsca + "/" + maxLiczbaMiejsc;
    }

    public void ZarezerwujMiejsce() {
        dostepneMiejsca++;
    }
}