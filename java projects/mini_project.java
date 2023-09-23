import java.util.*;

public class mini_project
{
    public static void main(String args[])
    {
        int num = (int)(Math.random()*100);
        int usernumber = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Guess any Random Number :");
            usernumber = sc.nextInt();
            if(usernumber == num)
            {
                System.out.println("--------------------------------------");
                System.out.println("WoW GREAT !! You have done it....");
                System.out.println(num+" is CORRECT NUMBER.");
                System.out.println("---------------------------------------");
                break;
            }
            else if(usernumber > num)
            {
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }
        }while(usernumber >= 0);
    }
}