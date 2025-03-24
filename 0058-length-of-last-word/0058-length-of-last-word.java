class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String trimmedS = s.trim();
        for(int i=trimmedS.length()-1;i>=0;i--){
            System.out.println("index :"+i);
            char storeChar = trimmedS.charAt(i);
            String store = String.valueOf(storeChar);
            System.out.println("character :"+store);
            if(!Character.isWhitespace(storeChar)){
                count = count+1;
                System.out.println("count :"+count);
            }else{
                break;
            }
        }
    return count;    
    }
}