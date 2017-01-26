package models;

/**
 * Created by ralph on 1/26/2017.
 */
public class Manager extends Werknemer {
    private double bonus;

    public Manager(double maandSalaris, String Naam){
        super(maandSalaris,Naam);
    }

    public void kenBonusToe(double bonus){
        this.bonus = bonus;
    }

    public double berekenInkomsten(){
       return super.berekenInkomsten() + bonus;
    }
}
