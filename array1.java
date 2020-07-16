# Java
import java.util.Scanner;
class Array
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int flag=1;
        int j=3;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum = arr[0]+arr[1]+arr[2];
        while(j<n)
            {
                int sum1 = arr[j]+arr[j+1]+arr[j+2];
                if(sum1==sum)
                    flag++;
                j+=3;
            }        
        if(n/3==flag)
            System.out.println("perfect batch");
        else
            System.out.println("not a perfect batch");
        }
}
