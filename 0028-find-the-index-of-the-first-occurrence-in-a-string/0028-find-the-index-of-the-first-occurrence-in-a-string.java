class Solution {
    public int strStr(String haystack, String needle) {
        String str="";
        int retVal=0;
        int ret=0;
        for(int i=0;i<haystack.length();i++){
            for(int j=i;j<=haystack.length();j++){
                String store = haystack.substring(i,j);
                if(store.equals(needle)){
                    retVal = i;
                    str = store;
                }
            }
            if(str.equals(needle)){
                break;
            }
        }

        if(str.equals(needle)){
            ret = retVal;
        }
        else{
            ret = -1;
        }

        return ret;          
    }
}