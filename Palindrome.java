import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		String reversed = new StringBuilder(str).reverse().toString();
		boolean check = str.equals(reversed);
		System.out.print("Palindrome String: "+check);
	}
}