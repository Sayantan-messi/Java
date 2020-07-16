# Java
class Repeat
{
    void display(int n)
    {
        int s=0;
        int d=0,c=0,m=0,k=0,d1=0;
        while(n!=0)
        {
            d=n%10;
            s=s*10+d;
            c++;
            n=n/10;
        }
        int arr[]=new int[c];
        int arr1[]=new int[c];
        while(s!=0)
        {
            d1=s%10;
            arr[k++]=d1;
            s=s/10;
        }
        arr1[0]=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr1[m]==arr[i])
            {
                arr1[m]=arr[i];
            }
            else
            {
                m++;
                arr1[m]=arr[i];
            }
        }
        System.out.println("the required number is");
        for(int i=0;i<arr.length;i++)
        {
            if(arr1[i]!=0)
                System.out.print(" "+arr1[i]);
        }
    }
}
