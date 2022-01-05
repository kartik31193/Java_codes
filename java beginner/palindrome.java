import java.util.Scanner;

public class palindrome{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    String s1 = sc.next();
    int len = s1.length();
    String s2 ="";
    for(int i =0; i< len ;i++){
      char ch = s1.charAt(i);
      s2 = ch + s2;
    }
    System.out.println("Reverse is : "+s2);
    if(s1.equals(s2))
      System.out.println("Number is a palindrome");
    else
      System.out.println("Number is not a palindrome");
  }
}
