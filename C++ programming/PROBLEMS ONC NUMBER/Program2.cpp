#include<iostream>
using namespace std;

void DisplayFactor(int iNo)
{
    if(iNo % 1 ==0)
    {cout<<"1"<<endl;}
    if(iNo % 2 ==0)
    {cout<<"2"<<endl;}
    if(iNo % 3 ==0)
    {cout<<"3"<<endl;}
    if(iNo % 4 ==0)
    {cout<<"4"<<endl;}
    if(iNo % 5 ==0)
    {cout<<"5"<<endl;}
}
int main()
{
int iValue = 0;
cout<<"Enter the Number : \n";
cin>>iValue;

DisplayFactor(iValue);
    return 0;
}