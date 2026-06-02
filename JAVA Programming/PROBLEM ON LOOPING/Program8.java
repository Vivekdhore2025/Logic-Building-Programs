import java.util.Scanner;
class Program8
{
    public static void Display(int iNo)
    {
        int iCnt  = 0;
        for(iCnt  = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the  Number :");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}