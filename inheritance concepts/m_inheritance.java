import java.io.*;
import java.util.*;

class Continent
{
    String continent_name;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Continent Name:");
        continent_name=sc.nextLine();
    }
    void display()
    {
        System.out.println("\nContinent Name: "+continent_name);
    }
}

class Country extends Continent
{
    String country_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Country Name:");
        country_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("\nCountry Name: "+country_name);
    }
}

class State extends Country
{
    String state_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter State Name:");
        state_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("\nState Name: "+state_name);
    }
}

class City extends State
{
    String city_name;
    void get()
    {
        super.get();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter City Name:");
        city_name=sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("\nCity Name: "+city_name);
    }
}

public class m_inheritance
{
    public static void main(String args[])
    {
        City k = new City();
        k.get();
        k.display();
    }
}