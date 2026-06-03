import java.util.*;
class Program3
{
    public static void DisplayFactor(int iNo)
    {
        for(int i = 1; i < iNo; i++)
        {
            if(iNo % i == 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Value:");
        int iValue = sobj.nextInt();
        DisplayFactor(iValue);
    }
}