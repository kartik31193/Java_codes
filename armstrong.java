import java.util.Scanner;
import java.lang.Math;
 public class armstrong{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    int len = Integer.toString(num).length();
    int sum = 0;
    int n=num;
    for(int i=0; i<len ;i++){
      int pick_last = n%10;
      sum = sum + (int)Math.pow(pick_last,len);
      n=n/10;
    }
    System.out.println("sum is: "+sum);
    if(sum==num){
      System.out.println("Number is armstrong no.");
    }
    else{
      System.out.println("Number is not a armstrong no.");
  }
}
 }
