import java.util.Scanner;
public class classes_objects{
    String name;
    int reg_no;
    String department;
    float cgpa;
    String specialization;
    String semester;
    /* 
    public classes_objects(String name,int reg_no,String department,float cgpa,String specialization,String semester){
        this.name= name;
        this.reg_no= reg_no;
        this.department= department;
        this.cgpa= cgpa;
        this.specialization= specialization;
        this.semester= semester;
    }
        */
    public String get(){
            return ("student name: " + name + "\n" +
                    "student reg_no: " + reg_no + "\n" +
                    "student department: " + department + "\n" +
                    "student cgpa: " + cgpa + "\n" +
                    "student specialization: " + specialization + "\n" +
                    "student semester: " + semester);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter student name:");
        String name= sc.nextLine();
        System.out.println("enter student reg_no:");
        int reg_no= sc.nextInt();
        sc.nextLine();
        System.out.println("enter student department:");
        String department= sc.nextLine();
        System.out.println("enter student cgpa:");
        float cgpa= sc.nextFloat();
        sc.nextLine();
        System.out.println("student specialization:");
        String specialization= sc.nextLine();
        System.out.println("enter student semester:");
        String semester= sc.nextLine();
        classes_objects obj= new classes_objects(name,reg_no,department,cgpa,specialization,semester);
        System.out.println(obj.get());
    }
    
}
