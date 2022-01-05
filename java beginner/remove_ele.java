public class remove_ele{
  public static void main(String[] args){

  }

  public static int[] removeElement(int[] arr,int index){
    if(arr==null)
      return arr;

    int[] newarr = new int[arr.length-1];

    for(int i=0;k=0;i<arr.length;i++){
      if(i==index)
        continue;

      newarr[k++]=arr[i];
    }
    return newarr;
  }
}
