public class SumofDiagonals{
  public static void main(String[] args){
    int [][]a = {{1,3,5,7},{5,6,7,8},{1,2,3,5},{0,9,8,7}};
    int n=4;
    int first=0,second=0;
    for(int i=0;i<n;i++){
      first+=a[i][i];
      second+=a[i][n-i-1];
    }
    int sum = first+second;
    System.out.println(sum);
  }
}
