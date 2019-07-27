import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
      int n1,ld;
		Scanner in=new Scanner(System.in);
      n1=in.nextInt();
      n1=n1/10;
      ld=n1%10;
      System.out.println(ld);
	}
}