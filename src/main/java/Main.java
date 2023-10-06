package main.java;

public class Main {
    public static void main(String[] args) {
        Kotik kotik = new Kotik("Tom", "Miow", 10, 5);

        System.out.println(Kotik.count);

        Kotik kotik1 = new Kotik("Bars", "MRR", 5, 2);

        System.out.println(Kotik.count);
    }
}
