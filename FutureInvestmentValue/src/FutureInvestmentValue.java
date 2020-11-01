
/*****
* Name: Feras
* Description: this program is designed to calculate the future investment value
* using a formula.
 */

//import
import java.util.* ;
public class FutureInvestmentValue {
    public static void main(String[] args) {
       //Create the scanner 
       Scanner input = new Scanner(System.in);
       
       //Enter Annual interest rate in percentage
       System.out.println("Enter annual interest rate: ");
       double annualInterestRate = input.nextDouble();
       
       //obtain monthly intereet rate
       double monthlyInterestRate = annualInterestRate/1200;
       
       //Enter number of years
       System.out.println("Enter the numbers of years as an integer: ");
       int numberOfYears = input.nextInt();
       
       //Enter investment amount
       System.out.println("Enter investment amount: ");
       double investmentAmount = input.nextDouble();
       
       //calculate payemnt 
       double monthlyPayment=Math.pow(1+monthlyInterestRate,numberOfYears * 12);
       double futureInvestmentValue = monthlyPayment *  investmentAmount ;     
      
       
       //diplay results
        System.out.println("The total payment is $" + 
          (int)(futureInvestmentValue * 100) / 100.0);
                 
    }//end main
}//end class
