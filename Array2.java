# Java
import java.util.Scanner;
public class Array2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<len;i++)
		{
		    arr[i] = sc.nextInt();
		}
		for(int i=0;i<len-2;i++)
		{
		    for(int j=i+1;j<len-1;j++)
		    {
		        for(int k=j+1;k<len;k++)
		        {
		            System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+") ");
		        }
		    }
		    System.out.println("");
		}
	}
}
