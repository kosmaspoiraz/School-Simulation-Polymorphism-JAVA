package lib;

public class Yard extends Place {
    public Yard() {
        System.out.println("A new Schoolyard has been created!");
    }

    public void enter(Student s) {
        System.out.println(s.getname() + " enters Schoolyard!");
        super.enter(s);
    }

    public Student exit() {
        System.out.println(super.exit().getname() + " exits Schoolyard!");
        return super.exit();
    }
}