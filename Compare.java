import java.util.*;
class Compare{
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
		
		System.out.print("Are both strings same? "+check(compare1, compare2));
		
		
	}
}