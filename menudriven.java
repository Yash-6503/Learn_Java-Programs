/* menu diven programm for 
1.Calculate the volume of cylinder
2.find factorial
3.check Armstrong
4.exit*/

import java.io.*;
import java.util.*;

public class menudriven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch, n, i, p=1, num, temp=0;
        double r, h, v;
        do
        {
            System.out.println("\nMenu\n");
            System.out.println("\n1.Calculate the volume of cylinder");
            System.out.println("\n2.Find the factorial of given number");
            System.out.println("\n3.Check the number is armstrong or not");
            System.out.println("\n4.Exit");
            System.out.println("\nEnter your Choice:");
            ch=Integer.parseInt(sc.next());
            switch(ch)
            {
                case 1:System.out.println("\nEnter the radius of cylinder:");
                       r=Double.parseDouble(sc.next());
                       System.out.println("\nEnter the height of cylinder:");
                       h=Double.parseDouble(sc.next());
                       v=3.142*r*r*h;
                       System.out.println("Volume: "+v+"cu units");
                       break;

                case 2:System.out.println("\nEnter the numbers:");
                       n=Integer.parseInt(sc.next());
                       for(i=1; i<=n; i++)
                       {
                        p=p*i;
                       }
                       System.out.println("Factorial: "+p);
                       break;

                case 3:System.out.println("\nEnter the number:");
                       num=Integer.parseInt(sc.next());
                       int tempnum=num;
                       int sum=0;
                       while(num!=0)
                       {
                        temp=num%10;
                        sum=sum+(temp*temp*temp);
                        num=num/10;
                       }
                       if(sum==tempnum)
                       System.out.println("\nNumber is Armstrong");
                       else
                       System.out.println("\nNumber is not Armstrong");
                       break;
                
                case 4:System.out.println("\nExit");
                       break;
                
                default:System.out.println("\nInvalid Choice");
                        break;                      
            }
        }while(ch!=4);
    }
}