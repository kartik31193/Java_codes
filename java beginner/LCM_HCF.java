import java.util.Scanner;
//a x b = LCM(a,b) x HCF(a,b)
public class LCM_HCF{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st numbers : ");
    int a = sc.nextInt();
    System.out.print("Enter 2st numbers : ");
    int b = sc.nextInt();
    System.out.println("LCM is : "+LCM(a,b));
    System.out.println("HCF is : "+GCD(a,b));
    
  }
static int GCD(int a, int b){
  if(a==0)
    return b;
  return GCD(b%a,a);
}
static int LCM(int a, int b){
  return (a/GCD(a,b))*b;
}
}
