package lib;

abstract class Place {
    Student student;

    public void enter(Student s) {
        student = s;
    }

    public Student exit() {
        return student;
    }

    public void place(Teacher t) {
    }

    public void operate(int hours) {
    }

}
