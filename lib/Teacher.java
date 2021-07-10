package lib;

public class Teacher extends Human {
    private int num_class;
    private int num_floor;
    private boolean inclass;
    private int Lt;

    public Teacher(int f, int c, int lt) {
        inclass = false;
        num_class = c;
        num_floor = f;
        Lt = lt;
        System.out.println("A new Teacher has been created! " + getname() + ". Floor number: " + num_floor
                + ". Class number: " + num_class);
    }

    public void teach(int hours) {
        setfatigue(getfatigue() + (hours * Lt));
    }

    public int getnumclass() {
        return num_class;
    }

    public int getnumfloor() {
        return num_floor;
    }

    public void setinclass() {
        inclass = true;
    }

    public boolean getinclass() {
        return inclass;
    }

    public void setoutofclass() {
        inclass = false;
    }
}
