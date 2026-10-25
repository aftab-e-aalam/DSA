class Solution {
    public boolean isPalindrome(int x) {
        int i=0;
        String str = Integer.toString(x);
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
        
    }
}