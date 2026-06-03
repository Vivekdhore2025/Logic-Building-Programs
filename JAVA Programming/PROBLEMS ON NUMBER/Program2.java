import java.util.*;

class Program2
{
    public static void DisplayFactor(int iNo)
    {
        if(iNo % 1 == 0)
        {System.out.println("1");}
         if(iNo % 2 == 0)
        {System.out.println("2");}
          if(iNo % 3 == 0)
        {System.out.println("3");}
           if(iNo % 4 == 0)
        {System.out.println("4");}
            if(iNo % 5 == 0)
        {System.out.println("5");}
    }
    public static void main(String Args[])
    {   
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int iValue = sobj.nextInt();
        DisplayFactor(iValue);
    }
}