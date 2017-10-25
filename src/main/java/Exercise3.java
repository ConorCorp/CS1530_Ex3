public class Exercise3 {

  public static void main(String args[]) {
    if( args.length != 1 ) {
      System.out.println("Incorrect # arguments: Exiting....");
      System.exit(1);
    }

    int n = Integer.parseInt(args[0]);

    System.out.println("Tri("+n+") = "+Tri(n));


  }

    public static int Tri(int n) {
      return (n * (n + 1)) / 2;
    }

}
