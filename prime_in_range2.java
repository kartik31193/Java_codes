import java.util.Scanner;
public class prime_in_range2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter start");
int start = sc.nextInt();
System.out.println("enter end");
int end = sc.nextInt();
prime_in_range2 p = new prime_in_range2();
p.printPrimes(start, end);
}

void printPrimes(int start, int end){
  for(int i=start;i<=end; i++){
    int f=0;
  for(int j=1;j<=i;j++){
    if(i%j==0 && i!=j){
      f=1;
      break;
  }

  }
  if(f==0){
  System.out.println(i);
  }
  }
}

}
