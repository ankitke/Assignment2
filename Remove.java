//Q3. Write a java program to remove a particular character from a String.

public class Remove 
{
    public static void main(String args[])
    {
        String s1="Ankit";
        for(int i=0; i<s1.length(); i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.print(s1.charAt(i));
        }
        
    }
}
