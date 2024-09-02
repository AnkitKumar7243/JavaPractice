import java.util.Scanner;

public class twelve_sumoftwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your first number : ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter your second number : ");
    //     int b = sc.nextInt();
    //    int sum = a + b;
    //     System.out.print("Your sum of number is : " + sum);


                     //square of number
        
                     
        // System.out.print("Enter your number : ");
        // int no=sc.nextInt();
        // int square=no*no;
        // System.out.println("Your Square is : "+square);  
        
        
        //      take two input a and b a>b and find the remainder when a is divided by b. (% it use for calculate remainder)

        System.out.print("Enter your dividend : ");
        int a=sc.nextInt();
        System.out.print("Enter your divisor : ");
        int b=sc.nextInt();
        int c=a/b;
        int r= a - (b*c);
        System.out.println("The reminder when "+a+" is divided with " +b+" is "+r);


    }


}
