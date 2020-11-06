public class recSand{
    public static void main(String[] args) {
        recFact(6);
        System.out.println("Rec Fact: " + recFact(6));
    }//main
    public static int recFact(int n){
        if(n == 1){
            return 1;
        }else{
            System.out.println("Value of n: " + n);
            System.out.println("Value of n-1: " + (n-1));
            return n*recFact(n-1);
        }
    }
}//class