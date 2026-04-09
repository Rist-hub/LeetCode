class Solution {
    public int singleNumber(int[] nums) {
        int max = 0, retVal = 0, negMax = 0;
        if(nums.length>1){
            for(int i=0; i<nums.length; i++){
                if(nums[i]<0){
                    if(negMax<(-1*nums[i])){
                        negMax = -1*nums[i];
                    }
                }else{
                    if(max<nums[i]){
                        max = nums[i];
                    }
                }
            }

            int[] hashArr = new int[max+1];
            int[] negativeHashArr = new int[negMax+1];
            for(int h=0; h<nums.length; h++){
                if(nums[h]>0){
                    hashArr[nums[h]] += 1;
                }
                else{
                    int negativeIndex = -1*nums[h];
                    negativeHashArr[negativeIndex] += 1;
                }
            }

            int numb = 0;
            for(int j=0; j<hashArr.length; j++){
                if(hashArr[j]==1){
                    numb = j;
                }
            }

            int negNumb = 0;
            for(int j=0; j<negativeHashArr.length; j++){
                if(negativeHashArr[j]==1){
                    negNumb = j;
                }
            }

            if(numb!=0){
                retVal = numb;
            }
            else if(negNumb!=0){
                retVal = -1*negNumb;
            }
        }else{
            retVal = nums[0];
        }

        return retVal;
    }
}