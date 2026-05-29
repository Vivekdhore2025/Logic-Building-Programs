#include<iostream>
using namespace std;

void Display(int iNo)
{
    int iCnt  = 0 ;
    for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
        cout<<"jay Ganesh..."<<endl;
    }
}
int main()
{
    int iValue = 0;
    cout<<"Enter number of time you want Display:"<<endl;
    cin>>iValue;
    Display(iValue);
    return 0 ;
}