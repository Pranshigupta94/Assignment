package EnhancedStudentManagementSystem;

public class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String course;
    private double[] grades;

    public Student(String name, int rollNumber, int age, String course, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        double avg = 0;
        for (int i = 0; i < grades.length; i++) {
            avg = avg + grades[i];
        }
        avg = avg / grades.length;
        return avg;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Roll no. : " + rollNumber);
        System.out.println("Age : " + age + " years");
        System.out.println("Course : " + course);
        System.out.print("Grades : " +calculateAverageGrade());

    }
}
