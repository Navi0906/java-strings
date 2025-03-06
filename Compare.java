import java.util.*;
class Compare{
	
	// Method to compare 2 srings using charAt()
	public static boolean check(String compare1, String compare2){
		if(compare1.length()!=compare2.length()){
			return false;
		}
		for(int i=0;i<compare1.length();i++){
			if(compare1.charAt(i)!=compare2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String compare1 = sc.next();
		System.out.print("Enter String 2: ");
		String compare2 = sc.next();
		
		// Using equals Built-in method and comparing both results
		boolean equalsTo = compare1.equals(compare2);
		boolean both = (equalsTo == check(compare1, compare2));
		
		System.out.println("Are both strings same? "+equalsTo);
		System.out.print("Are both results same? "+both);
		
		
	}
}

/*
Input:
abc
abd

Output:
Are both strings same? false
Are both results same? true
*/