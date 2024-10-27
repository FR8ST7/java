import java.util.Scanner;
public class Subject {
   
    private String subjectName;
    private String subjectCode;
    private int mark;
    private String grade;

    // Constructor
    public Subject(String subjectName, String subjectCode, int mark) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        setMark(mark); // Calculate grade when setting the mark
    }

    // Getter methods
    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    // Setter method for mark, which also sets the grade
    public void setMark(int mark) {
        this.mark = mark;
        this.grade = calculateGrade(mark);
    }

    // Simple grade calculation
    private String calculateGrade(int mark) {
        if (mark >= 90) return "A";
        if (mark >= 80) return "B";
        if (mark >= 70) return "C";
        if (mark >= 60) return "D";
        return "F";
    }
}

class Student {
    private String name;
    private int regNo;
    private String department;
    private String specialization;
    private String semester;
    private Subject[] subjects = new Subject[5]; // Fixed-size array for 5 subjects

    // Constructor
    public Student(String name, int regNo, String department, String specialization, String semester, Subject[] subjects) {
        this.name = name;
        this.regNo = regNo;
        this.department = department;
        this.specialization = specialization;
        this.semester = semester;
        this.subjects = subjects;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register No: " + regNo);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
        System.out.println("Semester: " + semester);
        System.out.println("Subjects:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("  " + subjects[i].getSubjectName() + " (" + subjects[i].getSubjectCode() + "): " +
                    subjects[i].getMark() + " - " + subjects[i].getGrade());
        }
        System.out.println();
    }

    public int getRegNo() {
        return regNo;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}

public class StudentGradeSheet {
    private static Student[] students = new Student[10]; // Fixed-size array for 10 students
    private static int studentCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Student Grade Sheet");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    editStudent(sc);
                    break;
                case 3:
                    deleteStudent(sc);
                    break;
                case 4:
                    displayStudentGradeSheet();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner sc) {
        if (studentCount >= students.length) {
            System.out.println("Cannot add more students. Maximum limit reached.");
            return;
        }

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter register no:");
        int regNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter department:");
        String department = sc.nextLine();

        System.out.println("Enter specialization:");
        String specialization = sc.nextLine();

        System.out.println("Enter semester:");
        String semester = sc.nextLine();

        Subject[] subjects = new Subject[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter subject " + (i + 1) + " name:");
            String subjectName = sc.nextLine();

            System.out.println("Enter subject " + (i + 1) + " code:");
            String subjectCode = sc.nextLine();

            System.out.println("Enter subject " + (i + 1) + " mark:");
            int mark = sc.nextInt();
            sc.nextLine(); // Consume newline

            subjects[i] = new Subject(subjectName, subjectCode, mark);
        }

        students[studentCount] = new Student(name, regNo, department, specialization, semester, subjects);
        studentCount++;
        System.out.println("Student added successfully.");
    }

    private static void editStudent(Scanner sc) {
        System.out.println("Enter the register number of the student you want to edit:");
        int regNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        Student student = findStudent(regNo);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Editing student with register number: " + regNo);

        Subject[] subjects = new Subject[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter new subject " + (i + 1) + " name:");
            String subjectName = sc.nextLine();

            System.out.println("Enter new subject " + (i + 1) + " code:");
            String subjectCode = sc.nextLine();

            System.out.println("Enter new subject " + (i + 1) + " mark:");
            int mark = sc.nextInt();
            sc.nextLine(); // Consume newline

            subjects[i] = new Subject(subjectName, subjectCode, mark);
        }

        student.setSubjects(subjects);
        System.out.println("Student details updated successfully.");
    }

    private static void deleteStudent(Scanner sc) {
        System.out.println("Enter the register number of the student you want to delete:");
        int regNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRegNo() == regNo) {
                students[i] = students[studentCount - 1];
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    private static void displayStudentGradeSheet() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }

        for (int i = 0; i < studentCount; i++) {
            students[i].displayDetails();
        }
    }

    private static Student findStudent(int regNo) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRegNo() == regNo) {
                return students[i];
            }
        }
        return null;
    }
}


