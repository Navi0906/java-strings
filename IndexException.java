import java.util.*;
class IndexException{
	
	public static void generate(){
		String str = "Hello";
		System.out.print(str.charAt(str.length()));
	}
	
	public static void handle(){
		String str = "Hello";
		try{
			System.out.print(str.charAt(str.length()));
		}
		catch(StringIndexOutOfBoundsException e){
			e.getMessage();
		}
	}

	public static void main(String[] args){
		//generate();
		handle();
	}
}