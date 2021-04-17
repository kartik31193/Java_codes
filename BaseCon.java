import java.util.Scanner;

public class BaseCon{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    int sbase = sc.nextInt();
    int rbase = sc.nextInt();

    System.out.println(sbase+" to "+rbase+" conversion: "+ baseConversion(num,sbase,rbase));

  }
  public static String baseConversion(String number, int sBase, int rBase){
    return Integer.toString(Integer.parseInt(number, sBase), rBase);
  }
}
