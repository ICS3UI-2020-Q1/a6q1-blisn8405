import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // crete scanner for user input
    Scanner input= new Scanner(System.in);
System.out.println("How many heights would you like to enter");
int Heights = input.nextInt(); 
    //create an array with 5 spots
    double[] cm = new double[Heights];
//put grades into the array using a loop
for(int i =0; i < Heights; i++){
    System.out.println("Please enter the heights" + (i+1));
    cm[i] = input.nextDouble();
}
// create a variable to store the sum
double sum = 0;

// user a for loop to go through the array and add to sum
for(int i = 0; i < Heights; i++){
  //add the grade to sum
  sum= sum + cm[i];
}
// detemine the average
double average = sum / Heights;

//let the user know
System.out.println("Your average height is " + average);
System.out.println("The heights above average are ");
for(int i = 0; i < Heights; i++){
  //display the heights
  if(cm[i] > average){
  System.out.println(cm[i]);
  
}
}
  }
}