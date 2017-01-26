package models;

/**
 * Created by ralph on 1/26/2017.
 */
public class Zzper extends Persoon implements Oproepbaar {
    private double uurtarief;
    private int urenGewerkt;

    public Zzper(double uurtarief, String naam){
        super(naam);
        this.uurtarief = uurtarief;
    }

    public double getUurtarief() {
        return uurtarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }

    public void setUurtarief(double uurtarief) {
        this.uurtarief = uurtarief;
    }

    @Override
    public double berekenInkomsten() {
        return uurtarief * urenGewerkt;
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt = urenGewerkt + uren;
    }
}
