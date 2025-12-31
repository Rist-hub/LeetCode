class Solution {
    public boolean isPalindrome(int x) {
        long tempX = x, count=0, backwardCount=x, compare=0, compareCount=0;
        long ten = 1; 
        if(x<0){
            return false;
        }else{
            while(tempX!=0){
                tempX=tempX/10;
                ten = ten*10;
                ++count;
            }
             System.out.println("count - "+count);
            compareCount=count/2;
            while(compareCount>0){
                tempX = x;
                ten = ten/10;
                System.out.println("ten - "+ten);
                tempX=tempX/ten;
                System.out.println("tempX - "+tempX);
                System.out.println(tempX%10); //Forward count
                int fwd = (int)tempX%10;
                tempX=backwardCount%10;
                System.out.println(tempX); //back count
                int back = (int)tempX;
                backwardCount=backwardCount/10;
                if(fwd==back){
                    System.out.println("inside compare if");
                    ++compare;
                }else if(fwd!=back){
                    System.out.println("else if");
                    break;
                }
                --compareCount;
            }
            System.out.println("comapare - "+compare);
            System.out.println("compareCount - "+compareCount);
            if(compare==(count/2)){
                System.out.println("pal");
                return true;
            }else{
                System.out.println("not pal");
                return false;
            }
        }    
    }
}