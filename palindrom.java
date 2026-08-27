public class palindrom {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        int n=s.length()-1;
        for(int i=0;i<=n/2;i++){
          
            if(s.charAt(i)!=s.charAt(n)){
                
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(n));
                System.out.println(false);
                return;
                
            }
            n--;

               }


    System.out.println(true);}

    
    
}
