public class recPrac {
  public static void main(String[] args){
    System.out.println(" Recursive 3!: "+recFac(3));
    System.out.println(" Recursive 4!: "+recFac(4));

  }

  public static int recFac(int n){
    if(n==1){
      return 1;
    }
    else{
      return n*recFac(n-1);
    }
  }

  //TODO non-recursive factorial
  public static int fac(int n){
    
  }
}
