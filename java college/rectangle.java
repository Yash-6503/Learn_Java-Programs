import java.io.*;
import java.util.*;

public class rectangle{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double l,b;
        double p,a;
        System.out.println("\nEnter the Length:");
        l=Double.parseDouble(sc.next());
        System.out.println("\nEnter the Breadth:");
        b=Double.parseDouble(sc.next());
        p=2*(l+b);
        a=l*b;
        System.out.println("\nArea= "+a+"sq units");
        System.out.println("\nPerimeter= "+p+"units");
    }
}