import java.io.*;
import java.util.*;

public class Addmul
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch, n, i, p=1, num, temp=0;
        int sum1, sum2, sum, mul;
        do
        {
            System.out.println("\nMenu\n");
            System.out.println("\n1.Addition");
            System.out.println("\n2.Multiplication");
            System.out.println("\n3.Exit");
            System.out.println("\nEnter your Choice:");
            ch=Integer.parseInt(sc.next());
            switch(ch)
            {
                case 1:System.out.println("\nEnter the Number 1 to Add:");
                       sum1=Integer.parseInt(sc.next());
                       System.out.println("\nEnter the Number 2 to Add:");
                       sum2=Integer.parseInt(sc.next());
                       sum=sum1+sum2;
                       System.out.println("Addition: "+sum);
                       break;
               
                case 2:System.out.println("\nEnter the Number 1 to Multiply:");
                       sum1=Integer.parseInt(sc.next());
                       System.out.println("\nEnter the Number 2 to Multiply:");
                       sum2=Integer.parseInt(sc.next());
                       mul=sum1*sum2;
                       System.out.println("Multiplication: "+mul);
                       break;

                case 3:System.out.println("\nEnter the Number 1 to Multiply:");
                
                case 4:System.out.println("\nExit");
                       break;
            }
        }while(ch!=2);
    }
}