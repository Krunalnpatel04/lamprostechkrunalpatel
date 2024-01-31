public static mostfrequrntelement(){
  public static void Main(String []ags){
      int[] arr={5,2,5,3,5,3,1};
      ArrayList<INTEGER> arr1=new ArrayList<>;
      for(int i=o;i<arr.length;i++){
          int count=1;
        for(int k=0;k<arr1.length;k++){
          if(arr[i]==arr1[k]){
            continue;
          }
        }

        for(int j=i+1;j<arr.length;j++){
            
          if(arr[i]==arr[j]){
                count++;
            }
          if(count>1){
            arr1.add(arr[i]);
          }
        }
  }
}

