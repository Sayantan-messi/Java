# Java
import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
		    Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    for(int rownum = 1; rownum <= n; ++rownum)
		    {
    		    for(int space = 1; space <= (n- rownum ); ++space)
    		    {
    		        System.out.print(" ");
		        }
            	for(int colnum = 1; colnum <= rownum; ++ colnum)
            	{
    		        System.out.print("* ");
    		    }  
            	System.out.print("\n");
		    }
    		int starcount = n;
    		for(int rownum =1; rownum <= n; rownum = rownum + 1)
    		{
    		    for(int space = 1; space <= rownum - 1; space = space + 1)
    		    {
        		    System.out.print(" ");
        		}
        		for(int colnum = 1; colnum <= starcount; colnum = colnum + 1)
        		{
        		    System.out.print("* ");
        		}
    		    System.out.print("\n");
      		    starcount = starcount -1;
		     }
    }
}
