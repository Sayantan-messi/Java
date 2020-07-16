# Java
import java.util.Scanner;
class Record
{
    String name[];
    int rnk[];
    Record()
    {
        name=new String[50];
        rnk=new int[50];
    }
    void readvalues()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the names");
        for(int i=0;i<50;i++)
        {
            name[i]=sc.nextLine();
        }
        System.out.println("enter the corresponding ranks");
        for(int i=0;i<50;i++)
        {
            rnk[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("the names and their corresponding ranks are");
        for(int i=0;i<50;i++)
        {
            System.out.println(name[i]+" "+rnk[i]);
        }
    }
}
public class Rank extends Record
{
    int index;
    Rank()
    {
        super();
        index=0;
    }
    void display()
    {
        for(int i=0;i<50;i++)
        {
            if(rnk[i]>rnk[index])
            {
                index=i;
            }
            /*else
            {
                index=i+1;
            }*/
        }
    }
    void Display()
    {
        super.display();
        System.out.println("the name of the student with topmost rank is"+" "+name[index]+" "+"and the rank is"+" "+rnk[index]);
    }
}

    
