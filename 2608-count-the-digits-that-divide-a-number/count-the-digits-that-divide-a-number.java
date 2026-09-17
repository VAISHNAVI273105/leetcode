class Solution {
    public int countDigits(int num) {
        int c=num;
        int dc=0;
        while(c>0){
            int d=c%10;
            if(num%d==0) dc++;
            c/=10;
        }
    return dc;
    }
}