# Java
import java.util.Scanner;
class arrrray
{
    void main(int a, int b)
    {
        int array_size = 5;
        int arr[]={23,24,67,56,57};
        int x=0,y=0,flag=0,flag1=0;
        for(int i=0;i<5;i++)
        {
            if(arr[i]==a)
            {
                flag++;
                x=i;
                break;
            }
        }
        for(int j=0;j<5;j++)
        {
            if(arr[j]==b)
            {
                flag1++;
                y=j;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(x);
        }
        else
             System.out.println(-1);
        if(flag1==1)
             System.out.println(y);
             else
              System.out.println(-1);
            }
        }
