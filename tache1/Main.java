package m1.examen_final.tache1;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList l = new LinkedList();
        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        System.out.println(l.toString());
        System.out.println(l.contains(2));
        System.out.println(l.indexOf(2));
        l.deleteFirst();
        System.out.println(l.toString());
        l.deleteLast();
        System.out.println(l.toString());
    }
}
