import java.util.Scanner;
abstract class staff
{
    protected int id;
    protected String name;
    staff(int sid, String sname)
    {
        id=sid;
        name=sname;
    }
    abstract void display();
}

class officeStaff extends staff
{
    String dept;
    officeStaff(int oid, String oname, String odept)
    {
        super(oid, oname);
        dept=odept;
    }
    void display()
    {
        System.out.println(id+"\t"+name+"\t"+dept);
    }
}


public class staff_inheritance
{
    public static void main(String args[])
    {
        int i, n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Staff:");
        n=sc.nextInt();
        officeStaff s[]=new officeStaff[n];
        System.out.println("Enter Details:");
        for(i=0;i<n;i++)
        {
            System.out.println("Enter Id: ");
            int id=sc.nextInt();
            System.out.println("Enter Name: ");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enetr Department: ");
            String dept=sc.nextLine();
            s[i]=new officeStaff(id, name, dept);
        }
        System.out.println("\nStaff Details are:\n");
        System.out.println("\nId\tName\tDepartment\n");
        for(i=0;i<n;i++)
        {
            s[i].display();
        }
    }
}