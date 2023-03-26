//Name: Vanessa Barajas
//Project: Flash Extra Credit Student Class Objects
//Class: CIT-63
//Date:3/25/2023
//References: https://www.youtube.com/watch?v=Mm06BuD3PlY
public class App {
    public static void main(String [] args) {
// Enter first student information:
        Student myStudent = new Student();
        myStudent.firstName = "John";
        System.out.println("First name: " + myStudent.firstName);
        myStudent.lastName = "Adams";
        System.out.println("Last name: " + myStudent.lastName);
        myStudent.major = "Political Science";
        System.out.println("Major: "+ myStudent.major);
        myStudent.gpa = 2.0;
        System.out.println("GPA: "+ myStudent.gpa);
        myStudent.age = 21;
        System.out.println("Age: "+ myStudent.age);
        myStudent.onProbation = true;
        System.out.println("On Probation: "+ myStudent.onProbation);

// Enter second student information:
        Student myStudent2 = new Student();
        myStudent2.firstName = "Olivia";
        System.out.println("First name: "+ myStudent2.firstName);
        myStudent2.lastName = "Benson";
        System.out.println("Last name: "+myStudent2.lastName);
        myStudent2.major = "Criminology";
        System.out.println("Major: "+ myStudent2.major);
        myStudent2.gpa = 4.0;
        System.out.println("GPA: "+ myStudent2.gpa);
        myStudent2.age = 22;
        System.out.println("Age: "+myStudent2.age);
        myStudent2.onProbation = false;
        System.out.println("On Probation: "+ myStudent2.onProbation);









    }
}
