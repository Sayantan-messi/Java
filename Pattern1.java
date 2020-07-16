# Java
class Pattern1
{
    void main(int n)
    {
        int arr[][]=new int[n-1][n];
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i%2==0&&j%2==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
