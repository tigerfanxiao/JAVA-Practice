/*
 * This file show main function also could take arguments.
 * Actually main function will take the arguments after the command you execute the java .class file
 * Run: 
 * 		java UseArgument Xu Zhu Lin
 * Result: 
 *  	Hi, xu, zhu, lin. How are you?
*/
public class UseArgument {
  public static void main (String[] args) {
    System.out.print("Hi, ");
    System.out.print(args[0]+", "); // get the first argument
    System.out.print(args[1]+", "); // get the second argument 
    System.out.print(args[2]); // get the third argument
    System.out.println(". How are you?"); 
  }
}
