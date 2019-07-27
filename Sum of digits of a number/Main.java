import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
          int n1=0,
         sum=0,
          rem=0;
    Scanner in=new Scanner(System.in);
    
     n1=in.nextInt();
    
    while(n1>0)
          {
            rem=n1%10;
      		sum=sum+rem;
      		n1=n1/10;
    }
    System.out.println(+sum);
  }
}
