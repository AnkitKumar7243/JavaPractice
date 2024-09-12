package conditionalstatements;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit you want to cheak by which number it is divisible");
        int n=sc.nextInt();
        if (n%2==0) {
            System.out.println("Number is divisible from 2 ");
       }
    
        if(n%3==0){
            System.out.println("Number is divisible by 3 ");
        }
        
    }
}
