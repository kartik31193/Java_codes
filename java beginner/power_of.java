import java.util.Scanner;
public class power_of{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int base= sc.nextInt();
    System.out.print("Enter power : ");
    int power=sc.nextInt();
    int result = 1;
    while(power!=0){
      result =  result*base;
      --power;
    }
    System.out.println("Answer is : "+result);

    }
}
