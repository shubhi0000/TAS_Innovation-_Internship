import java.util.*;

public class Task1 {
    public static void main(String args[]) {
        
        for(int i=1;i<=10;i++)
        {
         System.out.println("enter num1");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        int prod;
        prod=num1*num2;
        System.out.println(" "+num1+"*"+ num2+"="+ " "+prod);
        }
    }
}
