import java.util.*;
import java.io.*;
import javap.*;
public class sqtest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        sqrnum sq=new sqrnum();
        int n;
        System.out.println("Enter the numbers: ");
        n=sc.nextInt();
        sq.sqrnum(n);
    }
}