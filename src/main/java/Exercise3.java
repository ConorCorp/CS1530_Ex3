public class Exercise3 {

  public static void main(String args[]) {

    // Check if correct number of arguments
    if ( args.length != 1 ) {
      System.out.println("Incorrect number of arguments: Exiting...");
      System.exit(1);
    }

    // Calculate nth numbers in sequences only if argument is an integer
    try {
  
      int n = Integer.parseInt(args[0]);

      // Calculate and print the nth numbers in the sequences
      System.out.println("Tri(" + n + ") = " + Tri(n));
      System.out.println("Lazy(" + n + ") = " + Lazy(n));

    } catch (NumberFormatException e) {
      System.out.println("Argument is not an integer: Exiting...");
      System.exit(2);
    }


  }

  // Calculate nth value in triangle sequence
  public static int Tri(int n) {
    return (n * (n + 1)) / 2;
  }

  // Calculate nth value in lazy canter sequence
  public static int Lazy(int n) {
    return ((n*n) + n + 2)/2;
  }


}
