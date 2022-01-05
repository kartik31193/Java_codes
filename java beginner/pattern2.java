public class pattern2
{
	public static void main(String[] args) {
		//increasing triangle
		int n=5;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		      System.out.print("*");
		    }
		    System.out.println();
		}

			//decreasing triangle
		int x=5;
		for(int i=1;i<=x;i++){
		    for(int j=i;j<=x;j++){
		      System.out.print("#");
		    }
		    System.out.println();
		}
	}
}
