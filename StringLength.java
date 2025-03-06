import java.util.*;
class StringLength{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String str = sc.next();
		
		
		System.out.println("Length is "+calculate(str));
		boolean check = calculate(str)==str.length();
		System.out.println("Are both results same? "+check);
		
	}
	
	public static int calculate(String str){
		int count = 0;
		try{
			while(true){
				str.charAt(count);
				count++;
			}
		}
		catch(RuntimeException e){
			e.getMessage();
		}
		
		return count;
	}
}