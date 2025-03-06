import java.util.*;
class CompareSubstring{
	
	// Method to create substring using charAt()
	public static String create(String str, int start, int end){
		String sub = "";
		for(int i=start;i<end;i++){
			sub += str.charAt(i); 
		}
		return sub;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		System.out.print("Enter Starting index: ");
		int start = sc.nextInt();
		System.out.print("Enter Ending index: ");
		int end = sc.nextInt();
		
		// Using substring Built-in method and comparing both results
		String sub = str.substring(start, end);
		boolean both = (sub.equals(create(str, start, end)));
		
		System.out.println("SubString is "+sub);

		System.out.print("Are both results same? "+both);
		
		
	}
}

/*
Input:
hello
0
4

Output:
SubString is hell
Are both results same? true
*/