class Solution {
    public void rotate(int[] nums, int k) {
    // if(nums.length>1){
    //     int  tempIndex=0;
    //     int n = nums.length;
    //     for(int r=0; r<n/2; r++){
    //         tempIndex = nums[n-1-r];
    //         nums[n-1-r] = nums[r];
    //         nums[r] = tempIndex;
    //     }
    //     int tempK=0;
    //     for(int m=0; m<k/2; m++){
    //         tempK = nums[k-1-m];
    //         nums[k-1-m] = nums[m];
    //         nums[m] = tempK;
    //     }
    //     int tempNK=0, index=0;
    //     for(int p=k; p<(n+k)/2; p++){
    //         tempNK = nums[n-1-index];
    //         nums[n-1-index] = nums[p];
    //         nums[p] = tempNK;
    //         index++;
    //     }

    // }
        // while(l<=k){
        //     int temp = nums[nums.length-1];
        //     for(int i=nums.length-2; i>=0; i--){
        //         nums[i+1]=nums[i];
        //     }
        //     nums[0] = temp;
        //     l++;
        // }

        if(nums.length>1){
            int n = nums.length;
            k = k % n;
            reverseArray(nums, 0, n - 1);
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
        }

    }


    void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}