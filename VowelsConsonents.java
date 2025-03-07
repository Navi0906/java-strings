import java.util.*;
class VowelsConsonents{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int countVowels = 0;
		int countConsonents = 0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
				countVowels++;
			}
			else{
				countConsonents++;
			}
		}
		
		System.out.println("Number of vowels: "+countVowels);
		System.out.println("Number of consonents: "+countConsonents);
		
	}
}