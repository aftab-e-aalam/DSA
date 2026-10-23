class Solution {
    public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
        int k=0;
        int i=0;
        int max=0;
        while(i<s.length()){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i-k));
                k--;
            }
            else{
				set.add(s.charAt(i));
				i++;
				k++;
			}
            max = Math.max(k,max);
    
        }
        return max;
    }
}