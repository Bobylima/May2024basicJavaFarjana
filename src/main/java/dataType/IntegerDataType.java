package dataType;

public class IntegerDataType {
	/*
	 * My queen gave 100$
	 * buy apple, milk, pen
	 * bring change back
	 */

	public static void main(String[] args) {
		// primitive data for full number
		// short----16 bits
		 // int ---32 bits
		 //long ---64 bits
	 long queenGave=100;
	 short apple=50;
	 int milk=12;
	 long pen=30;
	 //if you have mix data type
	 //then just declare super data type/ take the bigger data type
	 long totalSpent=apple+milk+pen;
	 System.out.println(totalSpent);
	 
	long changeBack=queenGave-totalSpent;
	System.out.println(changeBack);
	 
	 // int is the data type
	// queenGave is the variable name
	// 100$ is value
	 
	 // Primitive data for decimal number
	//lets buy 3 tvs and 2 pc and tell me how much is avarage for each otem
	 //float--32 bits
	 //double---64 bits
	 
	 float tv=600.50f;
	 double pc=800.99;
	 float tvCost=tv*3;
	double pcCost=pc*2;
	
	double totalcost=tvCost+ pcCost;
	System.out.println(totalcost);
	
	  double avrageCost=totalcost/5;
	  System.out.println( avrageCost);
	}

}
