package models;

/**
 * Created by ralph on 1/26/2017.
 */
public abstract class Persoon implements Comparable <Persoon> {
    private String naam;

    public Persoon(String naam){
        this.naam = naam;
    }

    public abstract double berekenInkomsten();

    @Override
    public int compareTo (Persoon ander){
        return naam.compareTo(ander.toString());
    }
    
    @Override
    public String toString() {
        return this.naam;
    }
}
