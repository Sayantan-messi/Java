# Java
class Day
{
    void display(int year,int day)
    {
        String ar[] = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
        int arr[] = {31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
        String month = " ";
        if(day <366)
        {
            for(int i = 0 ; i < 12 ;)
            {
                if(day - arr[i] < 0)
                {
                    day = day;
                    month = ar[i];
                    break;
                }
                else
                {
                    i++;
                    day = day - arr[i];
                }
            }
        }
        System.out.println(" the required date is " + "  " + day + " th " + "  " + month + "  " + year);
    }
}
