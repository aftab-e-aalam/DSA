class Solution {
    int digitSq(int n){
		int temp=0;
		while(n>0){
			temp += Math.pow(n%10,2);
			n/=10;
		}
		return temp;
	}

    public boolean isHappy(int n) {
        		int num=n,slow=num,fast=num;
		
		while(fast!=1){

			slow=digitSq(slow);
			fast=digitSq(digitSq(fast));
			
            if(fast==1){
				return true;
			}
            if(fast==slow){
                return false;
            }
		}
		
		return true ;

        
    }
}