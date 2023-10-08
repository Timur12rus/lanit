import main.java.animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotikOne = new Kotik("Tom", "Miow", 10, 5);

        Kotik kotikTwo = new Kotik();
        kotikTwo.setName("Barsik");
        kotikTwo.setVoice("Mur-mur");
        kotikTwo.setSatiety(8);
        kotikTwo.setWeight(4);

        String[] actions = kotikOne.liveAnotherDay();
        int i = 0;
        for (String str : actions) {
            System.out.println(i + " - " + str);
            i++;
        }

        System.out.println("Имя котика: " + kotikOne.getName() + ", вес: " + kotikOne.getWeight());
        if (compareVoice(kotikOne, kotikTwo)) {
            System.out.println("Котики разговаривают одинаково");
        } else {
            System.out.println("Котики разговаривают по-разному");
        }

        System.out.println(Kotik.getCount());
    }

    static boolean compareVoice(Kotik kotikOne, Kotik kotikTwo) {
        if (kotikOne.getName().equals(kotikTwo.getName()))
            return true;
        else return false;
    }
}
