package models;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ralph on 1/26/2017.
 */
public class Bedrijf {
    private String naam;
    private ArrayList<Persoon> medewerkers = new ArrayList<>();

    public Bedrijf(String naam){
        this.naam = naam;
    }

    public void printInkomsten(){
        System.out.println("Inkomsten van alle personen:");
        Collections.sort(medewerkers);
        for (Persoon mederwerker : medewerkers){
            if(mederwerker.berekenInkomsten() == 0.0){
                System.out.println(mederwerker.toString() + ", bedankt voor uw inzet!");
            }
            System.out.println(mederwerker.toString() + "inkomsten : "
            + mederwerker.berekenInkomsten());
        }
    }
    public int aantalManagers(){
        int count = 0;
        for (Persoon m : medewerkers){
            if(m instanceof Manager){
                count++;
            }
        }
        return count;
    }

    public void neemInDienst(Persoon persoon){
        medewerkers.add(persoon);
    }

    @Override
    public String toString() {
        return "Bedrijf " + this.naam + " Heeft " + medewerkers.size() + " medewerkers:" +"\n"
                + medewerkers.toString();
    }
}
