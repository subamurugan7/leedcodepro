class Solution {
    public int arrangeCoins(int n) {
      int i=1;
      int count=0;
      while(i<=n){
        n=n-i;
        count++;
        i++;
      }  
      return count;
    }
}