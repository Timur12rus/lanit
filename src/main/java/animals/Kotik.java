package main.java.animals;

public class Kotik {
    private String name;
    private String voice;
    private float satiety;
    private float weight;

    private final int METHODS = 5;

    private static int count;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, float satiety, float weight) {
        this();
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;

    }

    public boolean play() {
        if (satiety > 0) {
            System.out.println("����� ������");
            satiety--;
            return true;
        } else {
            System.out.println("����� ������ ����");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("����� ����");
            satiety--;
            return true;
        } else {
            System.out.println("����� ������ ����");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            System.out.println("����� ������");
            satiety--;
            return true;
        } else {
            System.out.println("����� ������ ����");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            System.out.println("����� ������");
            satiety--;
            return true;
        } else {
            System.out.println("����� ������ ����");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            System.out.println("����� ��������");
            satiety--;
            return true;
        } else {
            System.out.println("����� ������ ����");
            return false;
        }
    }

    public void eat(int satietyValue) {
        satiety += satietyValue;
    }

    public void eat(int satietyValue, String foodName) {
        eat(satietyValue);
    }

    public void eat() {
        eat(5, "Kitikat");
    }

    public String[] liveAnotherDay() {
        String[] actionsArray = new String[24];
        for (int i = 0; i < 24; i++) {
            int randomValue = (int) (Math.random() * METHODS) + 1;
            switch (randomValue) {
                case 1:
                    if (play())
                        actionsArray[i] = "�����";
                    else {
                        eat();
                        actionsArray[i] = "��";
                    }
                    break;
                case 2:
                    if (sleep())
                        actionsArray[i] = "����";
                    else {
                        eat();
                        actionsArray[i] = "��";
                    }
                    break;
                case 3:
                    if (wash())
                        actionsArray[i] = "�����";
                    else {
                        eat();
                        actionsArray[i] = "��";
                    }
                    break;
                case 4:
                    if (walk())
                        actionsArray[i] = "�����";
                    else {
                        eat();
                        actionsArray[i] = "��";
                    }
                    break;
                case 5:
                    if (hunt())
                        actionsArray[i] = "��������";
                    else {
                        eat();
                        actionsArray[i] = "��";
                    }
                    break;
            }
        }
        return actionsArray;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public float getSatiety() {
        return satiety;
    }

    public float getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(float satiety) {
        this.satiety = satiety;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
