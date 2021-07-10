package lib;

public class Corridor extends Place {
    public Corridor() {
        System.out.println("A new Corridor has been created!");
    }

    public void enter(Student s) {
        System.out.println(s.getname() + " enters Corridor!");
        super.enter(s);
    }

    public Student exit() {
        System.out.println(super.exit().getname() + " exits Corridor!");
        return super.exit();
    }
}
