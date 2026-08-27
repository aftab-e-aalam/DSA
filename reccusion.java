public class reccusion {
    public static String sum(int n ,String name){
        System.out.println(name);
        n--;
        if(n==0){
            
            return name;
        }
        return sum(n, name);
    }
    public static void main(String[] args) {
        System.out.print(sum(100,"aftab"));
        
    }
}