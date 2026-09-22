class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        boolean isSubsequence=false;

        if(s == null || s.isEmpty()){
            isSubsequence = true;
            return isSubsequence;
        }


        while(i<s.length() && j<t.length()){
            if(t.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            else{
                j++;
            }
            if(i>s.length()-1){
                isSubsequence=true;
            }
        }
        return isSubsequence;
        
    }
}