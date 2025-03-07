import java.util.*;
class ReverseString{
	public static void main(String[] args){
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.print("Reversed String: "+reversed);
	}
}