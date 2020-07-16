# Java
class Stack
{
    String st[];
    int top;
    int size;
    int ctr;
    Stack()
    {
    }
    Stack(int cap)
    {
        size=cap;
        top=-1;
        st=new String[size];
    }
    void pushname(String n)
    {
        if(top==size-1)
        {
            System.out.println("STACK OVERFLOW!");
        }
        else
        {
            st[++top]=n;
        }
    }
    String popname()
    {
        if(top==-1)
        {
            System.out.println("STACK UNDERFLOW!");
            return " ";
        }
        else
        {
            return (st[top--]);
        }
    }
    void display()
    {
        for(ctr=top;ctr>=0;ctr--)
        {
            System.out.println(st[ctr]);
        }
    }
}
