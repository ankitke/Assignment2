//Q1. Write a java program to Reverse a string without using the inbuilt method.

public class Reverse 
{
    public static void main(String args[])
    {
        String  s= "Ankit"; 
        String s1="";
        for(int i=s.length(); i>0; i--)
        {
            System.out.println(s.charAt(i-1));
        }
    }
    
}

