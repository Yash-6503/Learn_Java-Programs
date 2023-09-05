/* write a program for multi-lavel inheritance such that country is inherited from continent, state is inherited form country. Display the place,State, country and continent.*/

import java.io.*;
import java.util.Scanner;
class Continent{
    String Continent_name;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Continent Name:");
        Continent_name=sc.nextLine();
    }
    void display()
    {
        System.out.println("Continent Name: "+Continent_name);
    }
}
class Country extends Continent{
    String Country_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Country Name:");
        Country_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Country Name: "+Country_name);
    }
}
class State extends Country{
    String State_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter State Name:");
        State_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("State Name: "+State_name);
    }
}
class Place extends State{
    String Place_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Place Name:");
        Place_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Place Name: "+Place_name);
    }
}

class multi_inheritance
{
    public static void main(String args[])
    {
        Place s = new Place();
        s.get();
        s.display();
    }
}