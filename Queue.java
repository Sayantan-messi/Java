# Java
class Queue
{
    int que[];
    int size;
    int front;
    int rear;
    Queue(int mm)
    {
        size=mm;
        front=0;
        rear=0;
        que=new int[size];
    }
    void addele(int v)
    {
        if(rear==size-1)
        {
            System.out.println("Overflow!");
        }
        else if(rear==0)
        {
            front=1;
            rear=1;
            que[rear]=v;
        }
        else
        {
            que[++rear]=v;
        }
    }
    int delete()
    {
        int val=0;
        if(rear==0)
        {
            val=-9999;
        }
        else if(front==rear)
        {
            val=que[front];
            front=0;
            rear=0;
        }
        else 
        {
            val=que[front++];
        }
        return val;
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(que[i]);
        }
    }
}
            
