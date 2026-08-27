
public class printNto1{
    public static void main(String[] args) {
        recursion recur =new recursion();
        recur.printRecusivly(10);
        
    }
}
class recursion{
    public int  printRecusivly(int n){
        if(n==1){
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        return printRecusivly(n-1);
    }

}