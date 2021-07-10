package lib;

public class Senior extends Student {
    private int Ls;

    public Senior(int f, int c, int ls) {
        super(f, c);
        Ls = ls;
    }

    public void attend(int hours) {
        setfatigue(getfatigue() + (hours * Ls));
    }

}
