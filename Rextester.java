# Java
class Rextester
{  
	  void main(int n) 
	  {
          for(int i=1; i<=n; i++)
          {
              if(i%2==0){
                  System.out.print(i+1);
              
              for(int j=1; j<n; j++)
                 System.out.print(i);
              
          }
          else
          {
              for(int j=1; j<n; j++) {
                  
                  System.out.print(i);
              }
                   System.out.print(i+1);
              }
              System.out.println(" ");
          }

      }
}
