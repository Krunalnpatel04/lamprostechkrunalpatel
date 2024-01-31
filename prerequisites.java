Public Static prerequisites.(){
  public static void main(String args[]){
      int []arr={10,2,4,5};
      String []arr1={"A","B","C","D"};
    int max=arr[0];
    char c;
    String s="";
    for(int i=0;i<arr.length();i++){
      for(int j=i+1;j<arr.length();j++){
        if(arr[j]>max){
          max=arr[j];
          c=j;
        }
      }
      s=c +">";
      
  }
}
  System.out.println(s)
}
