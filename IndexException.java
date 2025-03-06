import java.util.*;
class IndexException{
	
	public static void generate(String str){
		System.out.print(str.charAt(str.length()));
	}
	
	public static void handle(String str){
		try{
			System.out.print(str.charAt(str.length()));
		}
		catch(StringIndexOutOfBoundsException e){
			e.getMessage();
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//generate(str);
		handle(str);
	}
}