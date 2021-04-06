import java.util.Scanner;
public class sum_of_n_range{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting number :");
    int start =sc.nextInt();
    System.out.print("Enter end number :");
    int end =sc.nextInt();
    int sum =0;
    for(int i=start;i<=end;i++){
      sum=sum+i;
    }
    System.out.print("Sum is :"+sum);
    sc.close();
  }
}
