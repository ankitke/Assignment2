class PwReverse 
{
    public static void main(String[] args) 
    {
        String s="PWSKILLS";
        for(int i=s.length(); i>0; i--)
        {
            System.out.print(s.charAt(i-1));
        }
    }
}