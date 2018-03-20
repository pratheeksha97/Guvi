import java.util.*;
 
class Test
{
    public static void main(String []s)
    {
        int num;
       
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        num=sc.nextInt();
        if(num%2==0)
        {
        System.out.println("Even");
        }
        else
        {
        System.out.println("Odd");
        }     
    }
}
