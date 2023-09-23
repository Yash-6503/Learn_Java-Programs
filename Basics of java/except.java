import java.util.*;
import java.util.Arrays;

//Exception and file handling in java.

public class except
{
    public static void main(String args[])
    {
        int marks[] ={90, 92, 97};
        try{                                    //in try block error is fetched/handled.
            System.out.println(marks[2]);
        }
        catch(Exception e){                     //in catch block error is solved..
           System.out.println("please select array index between 0 to 2");
        }
        System.out.println("hello yash");
    }
}
