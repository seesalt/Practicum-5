package models;

/**
 * Created by ralph on 1/26/2017.
 */
public class Werknemer extends Persoon {
    private static  int laatstePersoneelsNummer = 999;
    private  double maandSalaris;
    private int personeelsNummer;

    public Werknemer(double maandSalaris, String naam){
        super(naam);
        this.maandSalaris = maandSalaris;
    }

    public static int getLaatstePersoneelsNummer() {
        return laatstePersoneelsNummer;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public static void setLaatstePersoneelsNummer(int laatstePersoneelsNummer) {
        Werknemer.laatstePersoneelsNummer = laatstePersoneelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    @Override
    public double berekenInkomsten(){
        return maandSalaris;
    }
}
