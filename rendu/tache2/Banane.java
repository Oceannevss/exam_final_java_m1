package m1.examen_final.rendu.tache2;

public class Banane extends Fruit {

    private static long valeur = 1;

    public Banane(String origine) {
        super(origine);
    }
    public Banane(String origine, Ticket etiquette){
        super(origine);
        this.valeur = etiquette.getPrixDiscount();
    }

    public long getvaleur() {
        return this.valeur;
    }
}

