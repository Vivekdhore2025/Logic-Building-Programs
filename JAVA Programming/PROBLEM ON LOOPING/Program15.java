import java.util.*;
class Program15
{
    public static void Display(int iValue)
    {
        int iCnt = 0 ;
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.print("*\t");
        }
    }
    public static void main(String Args[])
    {
        Scanner sobj  = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();

        Display(iNo);
        
    }
}