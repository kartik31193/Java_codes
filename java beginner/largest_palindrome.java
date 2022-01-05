import java.util.Scanner;

public class largest_palindrome{
  public static void main(String[] args){
    int []A = { 1, 232, 54545, 999991 };
    int max=-1;
    for(int i =0;i<A.length;i++){
      if(A[i]>max && ispalindrome(A[i])){
        max=A[i];
      }
    }
    System.out.println(max);
  }

  public static boolean ispalindrome(int n){
    String reverse="";
    String original=Integer.toString(n);
    while(n>0){
      int pick_last=0;
      pick_last=n%10;
      reverse=reverse+pick_last;
      n=n/10;
    }
    if(reverse.equals(original)){
      return true;
    }
    else{
      return false;
    }
  }
}
