package lib;

import java.util.ArrayList;

public class Floor {
    private final int num_floor;
    private int j = 0;
    private Corridor corridor;
    private ArrayList<Class> arrayc = new ArrayList<>();

    public Floor(int c_class, int numfloor) {
        num_floor = numfloor;
        System.out.println("A new Floor has been created! Floor number: " + num_floor);
        corridor = new Corridor();
        for (int i = 0; i < 6; i++) {
            arrayc.add(new Class(c_class, i, num_floor));
        }
    }

    public void print() {
        System.out.println("FLOOR NUMBER " + num_floor + " CONTAINS: ");
        for (Class i : arrayc) {
            i.print();
        }
    }

    public void enter(Student student) {
        System.out.println(student.getname() + " enters Floor number: " + num_floor + "!");
        corridor.enter(student);
        student = corridor.exit();
        int classtoenter = student.getnumclass();
        arrayc.get(classtoenter).enter(student);
    }

    public void place(Teacher t) {
        arrayc.get(t.getnumclass()).place(t);
    }

    public void operate(int hours) {
        System.out.println("FLOOR NUMBER " + num_floor + " OPERATES FOR " + hours + " HOURS!");
        for (Class i : arrayc) {
            i.operate(hours);
        }
    }

    public Student exit() {
        if (j < 6) {
            if (arrayc.get(j).getcapacity() > 0) {
                Student s = arrayc.get(j).exit();
                corridor.enter(s);
                s = corridor.exit();
                return s;
            } else {
                j++;
                return null;
            }
        } else {
            return null;
        }
    }

    public void teachers_out() {
        for (Class i : arrayc) {
            i.teacher_out();
        }
    }

}