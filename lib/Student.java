package lib;

public class Student extends Human {
    private int num_class;
    private int num_floor;
    private boolean inclass;

    public Student(int f, int c) {
        super();
        inclass = false;
        num_class = c;
        num_floor = f;
        System.out.println("A new Student has been created! " + getname() + ". Floor number: " + num_floor
                + ". Class number: " + num_class);
    }

    public int getnumclass() {
        return num_class;
    }

    public int getnumfloor() {
        return num_floor;
    }

    public boolean getinclass() {
        return inclass;
    }

    public void setinclass() {
        inclass = true;
    }

    public void setoutofclass() {
        inclass = false;
    }
}
