import java.io.*;
import java.util.Scanner;

public class reverse{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter how many elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("\nEnter the elements into the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        reverse(a);
        for(int i=0;i<n;i++)
        {
            System.out.printf("\na[%d]=%d\n",i,a[i]);
        }
    }

    public static void reverse(int[] a)
    {
        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[(a.length-1)-i];
            a[(a.length-1)-i]=temp;
        }
    }
}