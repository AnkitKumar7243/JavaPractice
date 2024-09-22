package OOPs;

public class student {
    int rollNo = 20;
    int height = 6;

    String studentName = "Ankit";

    public static void main(String[] args) {

        student obj1 = new student();
        // obj1.rollNo=20;
        // obj1.studentName="Ankit";
        System.out.println("Roll no is " + obj1.rollNo);
        System.out.println("Height is " + obj1.height + " feet");
        System.out.println("Name of student " + obj1.studentName);
        System.out.println(" ");
        student obj2 = new student();
        obj2.rollNo = 21;
        obj2.studentName = "Mr.Kumar";
        obj2.height = 179;

        System.out.println("Roll no is " + obj2.rollNo);
        System.out.println("Height is " + obj2.height + "cm");
        System.out.println("Name of student " + obj2.studentName);
    }
}
