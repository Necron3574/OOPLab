class Q8{
  public static void main(String args[]){
    int nums[] = {1,2,3,4,5,6,7,8,9,10};
    int count = 0;
    int lb = 1;
    for(int num:nums){
        System.out.print(num + " ");
        count ++;
        if(lb==count){
          System.out.println();
          count =0;
          lb += 1;
        }
    }
  }
}
