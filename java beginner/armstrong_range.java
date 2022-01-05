import java.util.Scanner;
import java.lang.Math;

public class armstrong_range{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
    System.out.println("Armstrong numbers between "+start+" and "+end+" are : ");
    int n, sum;
    for(int i=start;i<=end;i++){
      n=i;
      int len = Integer.toString(n).length();
      sum=0;
      while(n!=0){
        int pick_last =n%10;
        sum =sum + (int)Math.pow(pick_last,len);
        n=n/10;
      }
      if(sum==i)
        System.out.println(i);
    }
  }
}
