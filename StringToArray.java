import java.util.*;
class StringToArray{
	
	// Method to create Character array of string using charAt()
	public static char[] create(String str){
		char[] characters = new char[str.length()];
		for(int i=0;i<str.length();i++){
			characters[i] = str.charAt(i); 
		}
		return characters;
	}
	
	// Method checking that both methods are giving same result 
	public static boolean compare(char[] arr1, char[] arr2){
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		
		// Storing characters in array using Built-in method and user-defined mehtod
		char[] arr1 = str.toCharArray();
		char[] arr2 = create(str);
		
		System.out.println("The Character Array is ");
		for(int i=0;i<str.length();i++){
			System.out.print(arr1[i]+" "); 
		}
		System.out.println();
		System.out.print("Are both results same? "+compare(arr1, arr2));
		
		
	}
}

/*
Input:
hello

Output:
The Character Array is 
h e l l o
Are both results same? true
*/