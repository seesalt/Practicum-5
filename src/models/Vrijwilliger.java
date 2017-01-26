package models;

/**
 * Created by ralph on 1/26/2017.
 */
public class Vrijwilliger extends Persoon implements Oproepbaar {
    public Vrijwilliger(String naam){
        super(naam);
    }

    @Override
    public double berekenInkomsten(){
        return 0.0;
    }


    @Override
    public void huurIn(int uren) {

    }
}
