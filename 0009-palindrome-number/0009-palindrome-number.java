class Solution {
    public boolean isPalindrome(int x) {
        long tempX = x;
        int count=0, backwardCount=x, compare=0, compareCount=0;
        long ten = 1; 
        if(x<0){
            return false;
        }else{
            while(tempX!=0){
                tempX=tempX/10;
                ten = ten*10;
                ++count;
            }
            compareCount=count/2;
            while(compareCount>0){
                tempX = x;
                ten = ten/10;
                tempX=tempX/ten;
                int fwd = (int)tempX%10;
                tempX=backwardCount%10;
                int back = (int)tempX;
                backwardCount=backwardCount/10;
                if(fwd==back){
                    ++compare;
                }else if(fwd!=back){
                    break;
                }
                --compareCount;
            }
            if(compare==(count/2)){
                return true;
            }else{
                return false;
            }
        }    
    }
}