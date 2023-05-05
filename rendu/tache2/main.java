package m1.examen_final.rendu.tache2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        System.out.println("Exercice 1, tache 2");
        System.out.println("A quoi sert l'annotation override ?\n l'annotation override sert à redefinir une fonction");
        Orange a = new Orange("France",80);
        Orange b = new Orange("Italie",70);
        Orange c = new Orange("Espagne",30);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Une Arraylist est collection et possede les propriété d'un tableau et non le contraire");

        Orange e = new Orange("Portugal", 70, 2);
        System.out.println(e);
        //Orange d = new Orange("Italie", 50, 11);
        //System.out.println(d);

        System.out.println("Exercice 2, tache 2");
        System.out.println("Le comportement du code ci-dessus correspond-t-il à vos attentes ? Pourquoi ? " +
                "Que doit on modifier ? Utiliser l'annotation @Override pour vérifier");
        System.out.println("Oui le comportement du code correspond a mes attentes car == compare bien les" +
                "reference donc il n'y a que a==d qui doit retourner true et la fonction equals compare bien" +
                " l'origine et la valeur de l'orange pour savoir si c'est la meme");

        Basket b2 = new Basket();
        b2.addFruit(new Orange("France", 80));
        b2.addFruit(new Orange("Espagne", 80));
        b2.addFruit(new Orange("Floride", 90));
        b2.boycottOrigin("France");
        System.out.println(b2);

    }



}
