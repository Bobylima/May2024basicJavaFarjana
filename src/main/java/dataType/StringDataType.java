package dataType;

public class StringDataType {

	public static void main(String[] args) {
		//string is refferincial data type
		//unlimited memory
		//anything between ""
		
		String firstName="Farjana";
		//Sting is the data type====you must declare data type
		//firstName is the variable name
		//"Farjana" is the value of the variable
		
		String lastName="Lima";
		//only addition is allow for string data type
		//addition is called concatenation
		//and concatenation is allow 
		
		String fullName=firstName+lastName;
		System.out.println(fullName);
		
		String fullNameOne=firstName+" "+lastName;
		
		System.out.println(fullNameOne);
		
		String fullNameTwo="my full name is"+firstName+" "+lastName;
		System.out.println(fullNameTwo);
	}

}
