import java.util.Scanner;
import java.util.Arrays;

public class freq_array_ele{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i]=sc.nextInt();
    }

  }
  public static void countFreq(int arr[], int n){
    boolean visited[] = new boolean[n];

    Arrays.fill(visited, false);

    //traverse array and count frequencies
    for(int i=0;i<n;i++){
      //skip the element if already visited
      if(visited[i]==true)
        continue;
      //count frequency
      int count = 1;
      for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          visited[j]=true;
          count++;
        }
      }
      System.out.println(arr[i]+" "+count);
    }
  }
}
