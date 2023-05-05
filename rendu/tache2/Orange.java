package m1.examen_final.rendu.tache2;

public class Orange extends Fruit {

    private long value;
    //private String origin;
    private int seedsLevel;

    public Orange(String origine, long value) {
        super(origine);
        this.value = value;
        this.seedsLevel = 0;
    }
    public Orange(String origine, Ticket etiquette){
        super(origine);
        this.value = etiquette.getPrixDiscount();
    }

    public Orange(String origine,int value, int seedsLevel){
        super(origine);
        if (5*seedsLevel > value/2 ){
            throw new IllegalArgumentException("seed level to eleveted");
        }else{
            this.value = value - 5*seedsLevel ;
            this.seedsLevel = seedsLevel;
        }
    }

    public long getValue() {
        return value;
    }
    /*public String getOrigin() {
        return origin;
    }*/
    public boolean equals(Orange o){
        if(o.getValue() == this.getValue() && o.getOrigine()== this.getOrigine()){
            return true;
        }
        return false;
    }
    public String toString() {
        return "\nOrange "+ this.getOrigine() +" "+ this.getValue()*0.01 ;
    }
}
