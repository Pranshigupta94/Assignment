package EnhancedStudentManagementSystem;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Pranshi", 21, 20, "Java", new double[]{91.5, 85.0, 87.74});
        Student s2 = new Student("Manik", 23, 21, "JavaScript", new double[]{90.0, 88.5, 82.5});
        Student s3 = new Student("Priya", 30, 25, "c", new double[]{ 80.0, 78.5, 69.0});
        Student s4 = new Student("Mridul", 22, 24, "c++", new double[]{89.5, 85.5, 97.0});
        Student s5 = new Student("Abeer", 24, 27, "Python", new double[]{75.5, 79.0, 82.5});

        StudentManager studentManager = new StudentManager(new Student[]{s1,s2,s3,s4,s5});
        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.addStudent(s3);
        studentManager.addStudent(s4);
        studentManager.addStudent(s5);

        System.out.println("All Students: ");
        studentManager.displayAllStudents();

        System.out.println("***************");
        int rollNumSearch = 21;
        System.out.println("RollNumber : "+ rollNumSearch );
        studentManager.findStudentByRollNumber(rollNumSearch);
        System.out.println();

        System.out.println("***************");
        int rollNumRemove = 24;
        System.out.println();
        System.out.println("RollNumber to be removed: "+rollNumRemove);
        studentManager.removeStudentByRollNumber(rollNumRemove);

        System.out.println("***************");

        System.out.println("Display Top Student:");


        studentManager.displayTopStudent();

    }
}
