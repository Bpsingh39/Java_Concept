package over_hash_equal;

import model.Student;

import java.util.HashSet;

public class Over_Eq_Has {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet=new HashSet<>();
        Student student=new Student("Piyush",26,"CS");
        Student student1=new Student("Rohit",28,"IT");
        Student student2=new Student("Kabir",34,"IT");
        Student student3=new Student("Ravi",27,"CS");
        Student student4=new Student("Ravi",27,"CS");
        Student student5=new Student("Ravi",27,"CS");
        Student student6=new Student("Ravi",27,"CS");
        studentHashSet.add(student);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        studentHashSet.add(student6);

    for(Student var:studentHashSet){
        System.out.println("print name :"+var.getName());
        System.out.println("roll_no :"+var.getRoll_no());
        System.out.println("branch :"+var.getBranch());
    }
    }



}
