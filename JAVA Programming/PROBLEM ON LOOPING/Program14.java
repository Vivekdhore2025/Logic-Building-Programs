import java.util.*;

class Program14
{
    public static void Display(int iValue)
    {

    int iCnt =0;
    for(iCnt  = 1; iCnt <= iValue; iCnt++)
    {
        System.out.println("*");
    }
    }
    public static void  main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Nummber : ");
        int iNo = sobj.nextInt();

        Display(iNo);
    }
}