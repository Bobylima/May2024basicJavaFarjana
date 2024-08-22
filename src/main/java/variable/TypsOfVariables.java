package variable;

public class TypsOfVariables {
	//three types of variable
	//static
	//instance
	//local
	
	
  static String lastName="Lima";
 String firstName;
 
	public static void main(String[] args) {
		TypsOfVariables tov=new TypsOfVariables();
		tov.maryam();
		tov.aoyon();
	}
	
 public void maryam() {
	 firstName="maryam";
  double bankAccount=50000.00;
  System.out.println(firstName+" "+lastName );
  System.out.println(firstName + " has "+bankAccount);
 }
 
 public void aoyon() {
	double savingAccount=500.00;
	firstName="aoyon";
	System.out.println(firstName+" "+lastName );
	System.out.println(firstName + " has "+savingAccount);
 }
 
}
