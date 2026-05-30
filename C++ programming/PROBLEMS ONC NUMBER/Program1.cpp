#include<iostream>
using namespace std;

bool CheckFactor(int iNo1 , int iNo2)
{
    if((iNo1 % iNo2) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{ 
  int No1 = 0;
  int No2= 0;
  bool bRet = false;

  cout<<"Enter First Number : ";
    cin>>No1;

    cout<<"Enter Second  Number :";
    cin>>No2;

    bRet = CheckFactor(No1 , No2);
    if(bRet == true)
    {
        cout<<No2<<" is a factor of "<<No1 ;
    }
    else
{
        cout<<No2<<" is a not factor of "<<No1 ;

}
    return 0;
}
