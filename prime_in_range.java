import java.util.Scanner;
public class prime_in_range{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter start");
int x = sc.nextInt();
System.out.println("enter end");
int y = sc.nextInt();
prime_in_range p = new prime_in_range();
p.findPrime(x,y);
}
public void findPrime(int start,int end){
System.out.println("primes are : ");
for(int i=start ; i<=end; i++){
  int num=0;
  for(int j=1;j<=i; j++){
    if(i%j==0){
    num++;
    }
}
if(num==2){
System.out.print(i+"\t");
}

}
}
}
