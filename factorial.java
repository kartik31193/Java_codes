import java.util.Scanner;

public class factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>=0){
      int fac =1;
      for(int i = n; i>=1; i--){
        fac=fac*i;
      }
      System.out.println("Factorial of "+n+" is "+fac);
    }
  }

}
