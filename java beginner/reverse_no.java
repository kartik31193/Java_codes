import java.util.Scanner;

public class reverse_no{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no. : ");
    int n = sc.nextInt();
    String s= "";
    while(n!=0){
      int pick_last = n%10;
      s = s + Integer.toString(pick_last);
      n= n/10;
    }
    System.out.println("Reverse of no. is : "+s);
  }
}
