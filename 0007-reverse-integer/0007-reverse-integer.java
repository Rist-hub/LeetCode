class Solution {
    public int reverse(int x) { 
        int returnX=x;
        int temp = x,rem=0;
        long ten=1;
        long sum=0;
        if(returnX<0){
            temp=temp*(-1);
            x=x*(-1);
            while(temp!=0){
                temp=temp/10;
                ten=ten*10;
            }
            while(x>0){
                rem=x%10;
                ten=ten/10;
                sum=sum+(ten*rem);
                x=x/10;
            }
            sum=sum*(-1);
        }else{
            while(temp!=0){
                temp=temp/10;
                ten=ten*10;
            }
            while(x>0){
                rem=x%10;
                ten=ten/10;
                sum=sum+(ten*rem);
                x=x/10;
            }
        }
        if(sum <= Integer.MIN_VALUE || sum >= Integer.MAX_VALUE ){
            sum = 0;
        }

        return (int)sum;
    }
}