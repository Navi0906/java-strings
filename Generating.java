import java.util.*;
class Generating{
	// Method to generate exception
	public static void generateException(){
		String text = null;
		System.out.print(text.length());
	}
	// Method to handle exception
	public static void handleException(){
		String text = null;
		try{
			System.out.print(text.length());
		}
		catch(NullPointerException e){
			System.out.print("Exception Handled : "+e.getMessage());
		}
	}

	public static void main(String[] args){
		//Remove comment to generate exception
		//generateException();
		handleException();
	}
}