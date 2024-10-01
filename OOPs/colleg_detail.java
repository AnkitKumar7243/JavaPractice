package OOPs;
import java.util.Scanner;
public class colleg_detail {
    public static class student{
        int PRN ,  age;
        String name ,dob,mail,phno;
        double cgpa;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Student 1st Detail:- ");
        student x=new student();

        x.name="Ankit kumar";
        System.out.println(x.name);
       
        x.PRN=2114110545;
        System.out.println(x.PRN);
        x.dob="21/9/2004";
        System.out.println(x.dob);
        x.phno="9893729782";
        System.out.println(x.phno);
        x.age=21;
        System.out.println(x.age);
        x.mail="ankitkuamryadav6742786";
        System.out.println(x.mail);
        x.cgpa=8.1;
        System.out.println(x.cgpa);
        System.out.println(" ");
        System.out.println("Student 2nd Detail");
    ;
        student y=new student();
        y.name="Mr.kumar";
        y.PRN=212313124;
        y.age=22;
        y.phno="234567890";
        y.mail="dwfesSDFVDWSasdcda";
        System.out.println(y.name);
        System.out.println(y.PRN);
        System.out.println(y.age);
        System.out.println(y.phno);

        

    }
    
}
