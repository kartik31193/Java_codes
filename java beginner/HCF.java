import java.util.Scanner;

public class HCF{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st numbers : ");
    int a = sc.nextInt();
    System.out.print("Enter 2st numbers : ");
    int b = sc.nextInt();

    while(a!=0){
      int n = a ;
      a=b%a;
      b=n;
    }
    System.out.println("HCF is: "+b);

}
}
