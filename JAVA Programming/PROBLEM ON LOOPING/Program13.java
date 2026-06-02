import java.util.*;
class Program12
{
    public static void Display(int iValue)
    {
        int iCnt  = 0;
        for(iCnt = iValue; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
    public static void main(String Args[])
    {
        Scanner sobj  = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo1  = sobj.nextInt();

        Display(iNo1);
    }
}