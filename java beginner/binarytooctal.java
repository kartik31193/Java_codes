import java.util.Scanner;

public class binarytooctal{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int binary = sc.nextInt(System.in);
    int decimal =0;
    int i=0
    while(binary>0){
      int pick_last = binary%10;
      decimal += pick_last*Math*pow(2,n);
      binary = binary/10;
      n++;
    }
    int octal[] = new int[20];
    int j=0;
    while(decimal>0){
      int temp = decimal%8;
      octal[j++]=temp;
      decimal = decimal/8;
    }
    for(int k=i-1;k>=0;k--){
      System.out.print(octal[k]);
    }
  }
}
