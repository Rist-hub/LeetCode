class Solution {
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
        int count=0;
        int lastInd = strX.length();
        boolean result = false;
        if(strX.length()%2==0){
            for(int i=0;i<(strX.length())/2;i++){
                lastInd = lastInd - 1;
                if(strX.charAt(i)==strX.charAt(lastInd)){
                    count=count+1;
                }
            }
            if(count==(strX.length())/2){
                result = true;
            }
            else{
                result = false;
            }
        }
        else if(strX.length()%2!=0){
            for(int i=0;i<(strX.length()-1)/2;i++){
                lastInd = lastInd - 1;
                if(strX.charAt(i)==strX.charAt(lastInd)){
                    count=count+1;
                }
            }
            if(count==(strX.length()-1)/2){
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;
    }
}