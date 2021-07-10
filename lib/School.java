package lib;

import java.util.ArrayList;

public class School {
    Yard yard;
    Stair stair;
    private int j = 0;
    private ArrayList<Floor> arrayf = new ArrayList<>();

    public School(int c_class) {
        System.out.println("A new School has been created!");
        yard = new Yard();
        stair = new Stair();
        for (int i = 0; i < 3; i++) {
            arrayf.add(new Floor(c_class, i));
        }
    }

    public void print() {
        System.out.println("SCHOOL LIFE CONSISTS OF:");
        for (Floor i : arrayf) {
            i.print();
        }
    }

    public void enter(Student student) {
        System.out.println(student.getname() + " enters School!");
        yard.enter(student);
        student = yard.exit();
        stair.enter(student);
        student = stair.exit();
        int floortoenter = student.getnumfloor();
        arrayf.get(floortoenter).enter(student);
    }

    public void place(Teacher t) {
        arrayf.get(t.getnumfloor()).place(t);
    }

    public void operate(int hours) {
        System.out.println("SCHOOL OPERATES FOR " + hours + " HOURS!");
        for (Floor i : arrayf) {
            i.operate(hours);
        }
    }

    public void empty() {
        while (j < 3) {
            Student s = arrayf.get(j).exit();
            if (s != null) {
                stair.enter(s);
                yard.enter(stair.exit());
                s = yard.exit();
                System.out.println(s.getname() + " exits School!");
            } else {
                j++;
            }
        }
        for (Floor i : arrayf) {
            i.teachers_out();
        }
    }
}