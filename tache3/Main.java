package m1.examen_final.tache3;

public class Main {
    public static void main(String[] args) {
        Files f = new Files("/Users/adrien/Documents"); // /cours_poo/exam_final_java_m1/tache1
        System.out.println("exo1 - q1");
        f.printFiles();

        System.out.println("exo1 - q2 : On dit qu'une méthode est surchargée lorsqu'elle est définie plusieurs fois afin de modifier le nombre de parmètres attendus.");

        System.out.println("exo1 - q3");
        System.out.println(f.totalSizeOfFiles());

        System.out.println("exo1 - q4");
        System.out.println(f.mostRecentFile());

        System.out.println("exo1 - q5");
        f.printFiles("horizon");

        System.out.println("exo2 - q1");
        f.printFiles2("horizon");


        System.out.println("exo3 - q1");
        System.out.println("Il peut y avoir : "+26*26*9*9*9*26*26+" plaques d'imatriculation différentes");
    }
}
