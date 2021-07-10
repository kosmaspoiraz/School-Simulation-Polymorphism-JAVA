package lib;

public class Stair extends Place {
    public Stair() {
        System.out.println("A new Stair has been created!");
    }

    public void enter(Student s) {
        System.out.println(s.getname() + " enters Stair!");
        super.enter(s);
    }

    public Student exit() {
        System.out.println(super.exit().getname() + " exits Stair!");
        return super.exit();
    }
}