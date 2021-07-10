#README for JAVA COURSE 

WHAT IS IT ABOUT?

It's a simulation of a School using Classes and objects of Classes. 
The simulation is about entering students in the school, and then entering teachers. After the entering proccess the School begins to operate for N hours, students attend for N hours and teachers teach for N hours.
When the School stops to operate every Human in the School has a fatigue, which is being printed. Then the evacuation of school begins and every Human in the School exits the building on the opposite way he entered.

THE GOAL!

The Goal of this excercise is to implement the simulation using the advandages of inheritance and polymorphism in OOP with Java.

COMPILE AND RUN!

Command to compile: javac Μain.java
Execute with command line arguments: java Main c_class Lj Ls Lt N
Worked in VSCode. 
Tested at VSC integrated terminal, Windows Powershell, CMD and Kali Linux Terminal.

HOW IT WORKS?

Headers and Libraries:
For my simulation, I used:
- java.util.ArrayList 
- java.util.Collections
- java.util.Random

Design:

Each class is on its own .java file, and all the classes are in .lib directory

Inheritance table:
                        -Junior
            -Student
                        -Senior
    Human               
            
            -Teacher


            -Class
            -Corridor
            -Floor
    -Place
            -Stair
            -Yard
            -School

Super Class
-Human: is an abstract super class. It has the declarations of the functions the sub classes use. It implements the print method which is shared among all the derived classes. In the Human class there are the shared attributes and methods of the sub Classes, Student and Teacher.

Sub Classes (Inherits(extends) from  Human):
-Student: has its getters and setters methods.

-Teacher: has its getters and setters methods and a teach method which calculates fatigue.

Sub Classes(Inherits(extends) from Student):
-Junior , Senior: have an attend method which calculates fatigue.


Super Class:
-Place: is an abstract class. It has the declaration of the functions the sub classes use. It's an interface that describes the same capabilities the sub classes share. It is declared as an abstract super class so that it can not instantiate objects of this class, so that it can used only as an interface.

Sub Clases(Inherits(extends) from Place):
-Class: has an array list of type Student and an array list of type Teacher. It has a print method, which prints the students and the teacher of the class. It has an enter method which gets a student and stores it in the array list.It has an exit method which removes a student from the array list of class and returns the student. It has a place method,  which takes a teacher and stores it in the class. It has a teacher_out method which removes the teacher from the class and returns the teacher. It has an operate method, which gets the number of hours the school operates for. Then the students attend the class and the teacher teaches for the same number of hours.

-Floor: has an array list of type Class and a member of type Corridor. It has a print method, which initiates the printing of classes. It has an enter method which gets a student and forwards it further in the building until it reaches the correct class, after checking for it. It has a place method which gets a teacher and checks in which class the teacher is trying to enter and forwards it to the correct class. It has an operate method, which gets the number of hours the school operates for and it operates its classes for the same number of hours. It has an exit method which calls exit() of each class and gets a student. Then enters him to corridor. Then call exit() of corridor and gets a student who is finally exited-returned to the program.

-Corridor, Stair, Yard: have an enter and exit methods which overides base class's method and print messages, and then base class's method is called (super.enter(), super.exit()).


--School: is the class I use to access all the other classes. It has members of types Yard, Stair and an array list of type Floor. It has a print method which initiates the printing of the School and its places. It has an enter method which gets a student and forwards it further in the building until it reaches the correct floor. It has a place method which gets a teacher and checks in which floor is the class the teacher is trying to enter and forwards it to the correct floor. It has an operate method, which gets the number of hours the school operates for and it operates its floors for the same number of hours. It has an empty method which initiate the empting of school and handles enter() and exit() of students through floors, stair, yard.

MAIN:
-gets via command line arguments c_class, Lj, Ls, Lt, N.
-creates the School
-has 2 arrays lists of type Student and Teacher, which memories are being allocated with the capacity of students (6 students and a teacher per class, 6 classes per floor. FROM INSTRUCTIONS)
-creates objects of Students and Teachers, with floor and class number, and they are being stored in the array lists.
-"Shuffling" the arraylists so that the enter is random
-enter students in th school.
-entes teachers in the school.
-operates the school for N hours.
-prints the school, by printing its places' content.
-END

HONORABLE MENTIONS!

-stackoverflow.com
-to all our Asian friends in youtube.com
-to admin George of OOP forum at lists.di.uoa.gr

©   Kosmas Poirazoglou, 
    Department of Informatics and Telecommunications of the University of Athens


