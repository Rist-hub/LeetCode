class Solution {
    public int fib(int n) {
        int prev=0, current=1, next=0;
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else{
            for(int i=1; i<n; i++){
                next = current + prev;
                prev = current; 
                current = next; 
            }
        }

        return next;
    }
}