import java.util.*;

// various types of loops in java such as for, while, do-while,etc. all are below shown
//please unselect all comments before using.

public class loops{
    public static void main(String args[])
    {
        
        //for loop

        // for(i=0; i<=100; i++){
           
        //     System.out.println(i);
        // }

    //to print numbers in reverse order
        // for(i=100; i>=1; i--)
        // {
        //     System.out.println(i);
        // }

        //While Loop
        // int i = 1;

        // while(i <= 100)
        // {
        //     System.out.println(i);
        //     i+=1;
        // }

        // Do while loop
         
        // int i = 1;
        // do 
        // {
        //     System.out.println(i);
        //     i=i+1;
        // }while(i<=100);

        //accept number from user and display untill user gives negative value then stop.

        int num;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number: ");
            num=sc.nextInt();
            System.out.print("here is your number: ");
            System.out.println(num);
            
        }while(num >= 0);
    }
}