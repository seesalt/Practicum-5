import models.*;

/**
 * Main test het klassendiagram van de opgave.
 *
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bedrijf bedrijf = new Bedrijf("HvA");

        Werknemer w = new Werknemer(1200, "Jantine Jansen");
        bedrijf.neemInDienst(w);

        w = new Werknemer(1300, "Piet Pietersen");
        bedrijf.neemInDienst(w);

        Vrijwilliger v = new Vrijwilliger("Guus Goedhart");
        bedrijf.neemInDienst(v);
        v.huurIn(10);

        Manager m = new Manager(10000, "Brigitte Baas");
        bedrijf.neemInDienst(m);
        m.kenBonusToe(750);

        m = new Manager(10000, "Dirk Teur");
        bedrijf.neemInDienst(m);
        m.kenBonusToe(1200);

        Zzper z = new Zzper(120, "Beun Haas");
        bedrijf.neemInDienst(z);
        z.huurIn(40);

        System.out.println(bedrijf);
        bedrijf.printInkomsten();
        System.out.println("\nAantal in management: " + bedrijf.aantalManagers());
    }
}

