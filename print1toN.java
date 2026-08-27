public class print1toN {
    public static void main(String[] args) {
        solution sol=new solution();
        sol.printnum(10, 20);
    }
    
}
class solution{
    void printnum(int current,int n){
        if(current>n){
            return;
        }
        System.out.println(current);
        printnum(current+1, n);
    }

    
}