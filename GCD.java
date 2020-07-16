# Java
public class Main5{
  public static int gcd(int a,int b)
  {
    int min = 0,hcf = 0;
    if(a<b)
      min = a;
    else
      min = b;
    while(min>=1)
    {
      if(a%min==0&&b%min==0)
        hcf = min;
      else
        min--;
    }
    return hcf;
  }
}
