package lib;

import java.util.ArrayList;

public class Class extends Place {
    private int num_class;
    private int num_floor;
    private int capacity;
    private ArrayList<Student> arrays = new ArrayList<>();
    private ArrayList<Teacher> teacher = new ArrayList<>();

    public Class(int cclass, int numclass, int numfloor) {
        num_class = numclass;
        num_floor = numfloor;
        capacity = cclass;
        System.out.println(
                "A new Class has been created! Class number: " + num_class + ", in Floor number: " + num_floor);
    }

    public void print() {
        System.out.println("PEOPLE IN CLASS NUMBER " + num_class + ":");
        for (Student i : arrays) {
            i.print();
        }
        System.out.println("THE TEACHER IS: ");
        teacher.get(0).print();
    }

    public void enter(Student student) {
        arrays.add(student);
        student.setinclass();
        System.out.println(student.getname() + " enters Class number " + num_class + ", in Floor number " + num_floor);
    }

    public Student exit() {
        student = arrays.get(0);
        arrays.remove(0);
        student.setoutofclass();
        capacity--;
        System.out.println(student.getname() + " starts exiting!");
        System.out.println(student.getname() + " exits Class number " + num_class + ", in Floor number " + num_floor);
        return student;
    }

    public void place(Teacher t) {
        teacher.add(t);
        t.setinclass();
        System.out.println(
                "Teacher " + t.getname() + " enters Class number " + num_class + ", in Floor number " + num_floor);
    }

    public void teacher_out() {
        System.out.println("Teacher " + teacher.get(0).getname() + " is out! Class number " + num_class
                + ", Floor number " + num_floor);
        teacher.remove(0);
    }

    public void operate(int hours) {
        System.out.println(
                "CLASS NUMBER " + num_class + ", IN FLOOR NUMBER " + num_floor + " OPERATES FOR " + hours + " HOURS!");
        for (Student i : arrays) {
            i.attend(hours);
        }
        teacher.get(0).teach(hours);
    }

    public int getsizeoflist() {
        return arrays.size();
    }

    public int getcapacity() {
        return capacity;
    }
}