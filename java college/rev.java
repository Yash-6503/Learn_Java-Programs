import java.io.*;
import java.util.*;
public class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int a[];
        System.out.println("\nEnter the size of array:");
        n=sc.nextInt();
        int a[]=parseInt[n];
        System.out.println("\nEnter elements in array:");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=n-1; i>=0; i--)
        {
            System.out.println("reverse= "+a[i]);
        }
    }
}