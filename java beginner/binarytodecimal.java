import java.util.Scanner;

public class binarytodecimal{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int decimal = 0;
    int i=0;
    while(n>0){
      int pick_last=n%10;
      decimal+=pick_last*Math.pow(2,i);
      n=n/10;
      i++;
      }
    System.out.println(decimal);
  }
}
