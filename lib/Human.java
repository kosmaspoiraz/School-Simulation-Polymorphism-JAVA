package lib;

import java.util.Random;

abstract class Human {
    private String Name;
    private int fatigue = 0;
    String RandomNames[] = { "George", "John", "Mike", "Jack", "Bryan", "Samantha", "Samuel", "Michele", "Mary",
            "Sofia", "Clair", "Kathrin", "Jonas", "Jenny", "Sean", "Donald", "Barrack", "Billy", "Oliver", "Jake",
            "Noah", "James", "Mason", "Robert", "Jacob", "Michael", "Charlie", "William", "Margaret", "Megan",
            "Jessica", "Lilly", "Tracy", "Sarah", "Mia", "Elizabeth", "Jennifer", "Emma" };

    public Human() {
        Name = RandomNames[new Random().nextInt(RandomNames.length)];
    }

    public void attend(int hours) {
    }

    public void teach(int hours) {
    }

    public void print() {
        System.out.println(Name + " with Fatigue: " + fatigue);
    }

    public String getname() {
        return Name;
    }

    public int getfatigue() {
        return fatigue;
    }

    public void setfatigue(int f) {
        fatigue = f;
    }
}
