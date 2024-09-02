package conditionalstatements;
import java.util.Scanner;
public class eight_multiplecondition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        // int n=sc.nextInt();
        // if (n>99 && n<1000) {
        //     System.out.println("This is 3 digit number ");
            
        // }
        // else{
        //     System.out.println("Ti is not a 3 digit number ");
        //}
        //Take integr input & tell if it is a 2 digit number 

        int n =sc.nextInt();
        if(n>10&&n<99){
            System.out.println("this is 2 digit number ");
        }
        else{
            System.out.println("it is not a 2 digit number");
        }


    }
}
