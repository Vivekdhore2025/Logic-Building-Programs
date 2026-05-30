import java.util.*;
class Program1
{
    public static boolean CheckFactor(int iNo1 , int iNo2)
    {
        if((iNo1 % iNo2) == 0)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String Args[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number :");
        int iNo2 = sobj.nextInt();

        bRet = CheckFactor(iNo1 , iNo2);
        if(bRet == true)
        {
            System.out.println(iNo2 + " Number is Factor of " + iNo1);
        }
        else
            System.out.println(iNo2 + " Number is not  Factor of " + iNo1);
        {
        }


    }
}