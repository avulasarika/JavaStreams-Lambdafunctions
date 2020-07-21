import java.util.Scanner;

public class PalindromeStrings {



public static void main(String[] args) {
	   try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter no of strings");
		   String input;
		   int n=sc.nextInt();
		 
		   for(int i=0;i<n;i++) {
            input=sc.nextLine();
			System.out.println(isPalindrome(input));

		}
	}
}

public static boolean isPalindrome(String input) {
    StringBuilder reverse = new StringBuilder(input).reverse();
    return (reverse.toString()).equals(input);
}
}