import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int n1,fd,ld;
    Scanner in=new Scanner(System.in);
    n1=in.nextInt();
    fd=n1;
    while(fd>=10)
    {
      fd=fd/10;
    }
    ld=n1%10;
    int sum=fd+ld;
    System.out.println(sum);
  }
}
