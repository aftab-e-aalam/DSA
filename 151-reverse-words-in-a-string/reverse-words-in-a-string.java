class Solution {
    public String reverseWords(String s) {
			int start=0;
			int end=s.length()-1;

			while(s.charAt(start)==' '){
				start++;
			}
			while(s.charAt(end)==' '){
				end--;
			}
			StringBuilder newS = new StringBuilder();
			while(end>=start){
                if(s.charAt(end)==' '){
                    if(s.charAt(end+1)==' '){
                        end--;
                        continue;
                    }
                }
				newS.append(s.charAt(end));
				end--;
			}
			
		
			start=0;
			end=0;
			int length = newS.length();
			while(start<length){
				while( end<length && newS.charAt(end) !=' ' ){
					 end++;
					 
					}
					int nextStart = end + 1; 
					end--;
				if (start >= newS.length()){
					 break;
				 }
				while(start<end){
					char temp=newS.charAt(start);
					newS.setCharAt(start,newS.charAt(end));
					newS.setCharAt(end,temp);
					start++;
					end--;
					}
					
				start = nextStart;
				end = nextStart;
					
					
				}
				System.out.println(newS);
    
        
    return newS.toString();
    }
}