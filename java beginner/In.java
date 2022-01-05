import java.util.*;

public class In{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string(nextLine): ");
    String str1 = sc.nextLine();
    System.out.print("You have entered: "+str1);

    System.out.println();

    System.out.print("Enter a string(next): ");
    String str2 = sc.next();
    System.out.print("You have entered: "+str2);


    System.out.println();
    sc.nextLine();


    String s[]= sc.nextLine().split(" ");
    int[] a = new int[s.length];
    for(int i =0 ;i < s.length;i++){
        a[i]= Integer.parseInt(s[i]);
    }

    for(int i =0 ;i < a.length;i++){
        System.out.print(a[i]);
      }
  }
}
