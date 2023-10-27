Q1. Write a simple String program to take input from user.

import java.util.Scanner;
class Input
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name = ");
        String str=s.nextLine();
        System.out.println(str);
    }
}