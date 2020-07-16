# Java
import java.util.Scanner;
class Matrix
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int  a[] = new int[s];
    int  b[] = new int[s];
    int  c[] = new int[s];
    int bb[] = new int[s];
    int cc[] = new int[s];
    int k = 0;
    int l = 0;
    for(int j=0;j<s;j++)
    {
      a[j] = sc.nextInt();
    }
    int r = sc.nextInt();
            /*
            System.out.print("Accepted Array: ");
            for(int j=0;j<s;j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
            */
    for(int j=0;j<s;j+=2)
    {
      b[k++] = a[j];
    }
            /*
            System.out.print("b: ");
            for(int j=0;j<k;j++)
            {
                System.out.print(b[j]+" ");
            }
            System.out.println();
            */
    for(int j=1;j<s;j+=2)
    {
      c[l++] = a[j];
    }
            /*
            System.out.print("c: ");
            for(int j=0;j<l;j++)
            {
                System.out.print(c[j]+" ");
            }
            System.out.println();
            */
    for(int j=0;j<k;j++)
    {
        if(j-r>-1)
        bb[j] = b[j-r];
        else
        bb[j] = b[j-r+k];
        
    }
            /*
            System.out.print("bb: ");
            for(int j=0;j<k;j++)
            {
                System.out.print(bb[j]+" ");
            }
            System.out.println();
            */
    for(int j=0;j<l;j++)
    {
        if(j+r<l)
        cc[j] = c[j+r];
        else
        cc[j] = c[j+r-l];
    }
            /*
            System.out.print("cc: ");
            for(int j=0;j<l;j++)
            {
                System.out.print(cc[j]+" ");
            }
            System.out.println();
            */
    k=0;
    l=0;
    for(int j=0;j<s;j++)
    {
      if(j%2==0)
      System.out.print(bb[k++]+" ");
      else
      System.out.print(cc[l++]+" ");
    }
  }
}
