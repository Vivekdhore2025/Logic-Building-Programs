#include<iostream>
using namespace std;

void DisplayFactor(int iNo)
{
    int iCnt  = 0;
    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt ) == 0)
        {
            cout<<iCnt<<endl;
        }
    }
}   
int  main()
{
int iValue = 0;
cout<<"Enter First Number : \n";
cin>>iValue;

DisplayFactor(iValue);
    return 0;
}