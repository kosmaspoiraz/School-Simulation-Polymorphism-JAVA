
import java.util.ArrayList;
import java.util.Collections;

import lib.Junior;
import lib.School;
import lib.Senior;
import lib.Student;
import lib.Teacher;

public class Main {

    static School sxoleio;

    public static void main(String[] args) {

        final int c_class = Integer.parseInt(args[0]);
        final int Lj = Integer.parseInt(args[1]);
        final int Ls = Integer.parseInt(args[2]);
        final int Lt = Integer.parseInt(args[3]);
        final int hours = Integer.parseInt(args[4]);
        int i = 0;

        // SCHOOL CREATION
        sxoleio = new School(c_class);

        // STUDENTS CREATION AND SHUFFLING
        ArrayList<Student> arrays = new ArrayList<>();
        while (i < (18 * c_class)) {
            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    arrays.add(new Junior(f, c, Lj));
                    i++;
                }
                for (int c = 3; c < 6; c++) {
                    arrays.add(new Senior(f, c, Ls));
                    i++;
                }
            }
        }
        Collections.shuffle(arrays);

        // TEACHERS CREATION AND SHUFFLING
        ArrayList<Teacher> arrayt = new ArrayList<>();
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 6; c++) {
                arrayt.add(new Teacher(f, c, Lt));
            }
        }
        Collections.shuffle(arrayt);

        // ENTERING STUDENTS
        for (Student s : arrays) {
            sxoleio.enter(s);
        }

        // ENTERING TEACHERS
        for (Teacher t : arrayt) {
            sxoleio.place(t);
        }

        // OPERATING SCHOOL FOR N HOURS
        sxoleio.operate(hours);

        // PRINTING SCHOOL
        sxoleio.print();

        // START OF EVACUATION
        sxoleio.empty();
    }
}