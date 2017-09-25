package edu.cnm.deepdive.intro;

/**
 * This class demonstrates iteration over command line arguments.
 *
 * @author Ana Kistner
 */
public class CommandLineArgs {

  private static final String ARGUMENT_FORMAT = "Argument %d = %s%n";


  /**
   * Iterates through the arguments <code>args</code>, printing each one.
   *
   * @param args  command line arguments
   */
  public static void main(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) {
      String argument = args[i];
      System.out.printf(ARGUMENT_FORMAT, i, argument);
    }
  }
}
