#include<iostream>
using  namespace std;
void Display(int iNo)
{
    int iCnt  = 0;
    for(iCnt = iNo ; iCnt >=1; iCnt--)
    {
        cout<<iCnt<<endl;
    }
}
int main()
{
int iValue = 0 ;
cout<<"Enter the number : \n"<<endl;
cin>>iValue;
Display(iValue);

    return 0;
}