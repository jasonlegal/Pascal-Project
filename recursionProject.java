/* Name(Edwin Hernandez)
 * Name(Jason Ortiz)
 * Date(March 11 ,2019)
 * Purpose:
 * The program is used to take any number and translate that number the number of rows of pascal triangle. The triangle is then printed.
 * Input:
 * # of rows
 * Output:
 * n lines of pascals triangle
 */
import java.util.Scanner;// this package was to take in an input
public class recursionProject {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("How many lines would you like?");//requesting the user for number of lines in the triangle
	    int rows = scanner.nextInt();//variable that stores the user 
	    System.out.println("Pascal Triangle:");//header for output
	    print(rows);
	}
	  public static int pascal(int i, int j) {
	    if (j == 0) {
	      return 1;
	    } 
	    else if(j==i) {
	    	return 1; 
	    }
	    else {
	      return pascal(i - 1, j - 1) + pascal(i - 1, j);
	    }
	  }
	  public static void print(int lines) {
		    for (int i = 0; i < lines; i++) {
		      for (int j = 0; j <= i; j++) {
		        System.out.print(pascal(i, j) + " ");
		      }
		      System.out.println();
		    }
		  }
}

