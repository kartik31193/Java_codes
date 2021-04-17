import java.util.Scanner;

public class LCM{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st numbers : ");
    int a = sc.nextInt();
    System.out.print("Enter 2st numbers : ");
    int b = sc.nextInt();
    int i;
    int x =(a > b)? a : b;
		for(i = x ; i <= a*b; i=i+x)
		{
			if(i % a == 0 && i % b == 0)
				break;
		}
		//printing result
		System.out.println("LCM of "+a+" and "+b+" is : "+i);


}
}
