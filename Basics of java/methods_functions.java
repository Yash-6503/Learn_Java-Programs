import java.util.*;

//Methods are written seperately and called by function() in main code.

public class methods_functions
{
    //functions and methods operations are performed in public class only..
    public static void printSum(int a, int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }

    public static void printName(String name)
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        printSum(1, 5);     //function printSum() is called here from its method.
        printName("yash");  //function printName() is called here from its method.
    }
}

