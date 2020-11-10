public class recPrac {
  public static void main(String[] args){
    System.out.println(" Recursive 3!: "+recFac(3));
    System.out.println(" Recursive 4!: "+recFac(4));
    System.out.println(" Non-Recursive 3!: "+fac(3));
    System.out.println(" Non-Recursive 4!: "+fac(4));
    System.out.println(" While 3!: "+fac2(3));
    System.out.println(" While 4!: "+fac2(4));
    
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
    int product = 1;
    for(int b = 1; b < n + 1; b++ ){
      product = product * b ;
      System.out.println("B: " +b);
      System.out.println("Product: " +product);
    }
    
    return product;
  }
  public static int fac2(int n){
    int product = 1;
    int b = 1;
    while(b != n){
        b++;
        product = product*b;
    }
    return product;
  }

  
}
