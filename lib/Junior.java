package lib;

public class Junior extends Student {
    private int Lj;

    public Junior(int f, int c, int lj) {
        super(f, c);
        Lj = lj;
    }

    public void attend(int hours) {
        setfatigue(getfatigue() + (hours * Lj));
    }
}
