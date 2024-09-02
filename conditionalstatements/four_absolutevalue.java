package conditionalstatements;
import java.util.Scanner;
public class four_absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer ");
        int n =sc.nextInt();
        if(n<0){
            n=n*(-1);
        }
        System.out.println("The absolute valu is "+n);
    }
    
}
