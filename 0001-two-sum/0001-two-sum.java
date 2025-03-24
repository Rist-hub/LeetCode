class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum ={0,1};
        for(int i=0;i<nums.length;i++){
            int numsStore = nums[i];
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    int add = numsStore + nums[j];
                    if(add!=target){
                        continue;
                    }
                    else{
                        twoSum[0] = i;
                        twoSum[1] = j;
                        System.out.println(Arrays.toString(twoSum));
                    }
                }
            }
        }
        
    return twoSum;
    }
}