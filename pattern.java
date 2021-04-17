import java.util.Scanner;

public class pattern{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String s="*";
    int h='#';
    int i=0;
    for(i=0;i<x;i++){
      System.out.print(s.repeat(i));
        for(int j=x;j>i;j--){
            System.out.print((char)h);
          }
        System.out.println();
      }

  }
}
