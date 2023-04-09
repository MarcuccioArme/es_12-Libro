import java.util.Scanner;

class Test {
    public static void main(String...args) {

        String Titolo;
        String Autore;
        int Pagine;

        Scanner in = new Scanner(System.in);

        Libro Lib1 = new Libro("Cappuccetto rosso", "Bethan Woollvin", 10);
        Libro Lib2 = new Libro("Le avventure di Pinocchio", "Carlo Scataglini", 128);

        Lib1.Visualizza();
        Lib2.Visualizza();

    }
}