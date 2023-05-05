package m1.examen_final.rendu.tache2;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private ArrayList<Fruit> listeFruit;
    private int id;
    private static int instance;

    public Basket() {
        instance++;
        this.id = instance;
        this.listeFruit = new ArrayList<>();
    }
    public int get(){
        return this.id;
    }
    public void addFruit(Fruit fruit){
        listeFruit.add(fruit);
    }
    public long getBasketValue(){
        Long basketvalue = 0L;
        for( Fruit fruit : this.listeFruit){
            if(fruit instanceof Orange){
                basketvalue =+ (((Orange) fruit).getValue());
            }else if( fruit instanceof Banane){
                basketvalue =+ ( ((Banane) fruit).getvaleur());
            }

        }
        return basketvalue;
    }
    public void boycottOrigin(String country){
        for(int i=0; i<listeFruit.size(); i++){
            if(listeFruit.get(i).equals(country)){
                listeFruit.remove(listeFruit.get(i));
            }
        }
    };
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(this.listeFruit.toString());
        return "Basket id - "+ this.get() + "- " + str;
    }
}
