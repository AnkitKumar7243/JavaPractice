package OOPs;

public class  studentclass {
    public static class  student{
        String name;
        int roll_no;
        double perc;
    }
    public static class college{
        String name;
        int rollno;
        double cgpa;
        String skill;
        String collegemail;
    }
    public static void main(String[] args) {
        student x =new student();
        x.name="Ankit";
        x.roll_no=50;
        x.perc=92.7;
        System.out.println(x.name);
        System.out.println(x.roll_no);
        System.out.println(x.perc+7) ;
        college y=new college();
        y.name="Mr.Ankit Kumar";
        y.rollno=2114110545;
        y.cgpa=8.2;
        y.skill="Java dsa, Html ,css, etc";
        y.collegemail="ankitkumaryadav7243@gmail.com";
        System.out.println(y.name);
        System.out.println(y.rollno);
        System.out.println(y.cgpa+" cgpa");
        System.out.println(y.skill);
        System.out.println(y.collegemail);
    }

}
