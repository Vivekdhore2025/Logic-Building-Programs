import java.util.*;
class Program11
{
    public static void  Display(int iNo)
    {
int iCnt  = 0;
for(iCnt = 1; iCnt <= iNo; iCnt++)
{
    System.out.println("Hello"+iCnt);
}
    }
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int iValue = sobj.nextInt();


      Display(iValue);
    }
}