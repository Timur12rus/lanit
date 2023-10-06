package main.java;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik("Tom", "Miow", 10, 5);
        String[] actions = kotik.liveAnotherDay();
        int i = 0;
        for (String str : actions) {
            System.out.println(i + " - " + str);
            i++;
        }
    }
}
