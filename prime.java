import java.util.Scanner;
public class prime {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no. : ");
int n = sc.nextInt();
int[] factors = new int[n];
for(int i=1;i<=n;i++){
  if(n%i==0){
    factors[i-1]=i;}
}
int num=0;
System.out.println("factors are : ");
for (int j = 0; j <factors.length; j++){
  if(factors[j]!=0){
    num++;
    System.out.println(factors[j]);}

}
if(num==2){
  System.out.println("Given no. is a prime no.");
}
else{
  System.out.println("Given no. is not a prime no.");
}
}
}
