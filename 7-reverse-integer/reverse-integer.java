class Solution {
    public int reverse(int x) {
        int v=0;
        while(x>0||x<0){
            if(v>Integer.MAX_VALUE/10||v <Integer.MIN_VALUE/10)
            return 0;
            v=(v*10)+(x%10);
            x=x/10;

        }
      return v;
    }

        
}