import java.util.Scanner;
public class sum_of_digits{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
int sum=0;
while(n!=0){
  int pick_last = n%10;
  sum = sum + pick_last;
  n=n/10;
}
System.out.println("Sum of digits : "+sum);
sc.close();
}
}
