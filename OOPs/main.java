package OOPs;
import java.util.Scanner;
class Algebra{
    int add(int a ,int b){
        int ans =a+b;
        return ans;
    }
}
public class main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Sum of number is ");
        int ans= obj.add(a,b);
        System.out.print( ans);
        System.out.println(Math.floor(9.9));
        System.out.println(Math.floor(5.8));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(24));
    }
    
}
