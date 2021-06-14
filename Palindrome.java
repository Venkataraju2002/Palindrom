import java.util.*;
public class Palindrome {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int num =s.nextInt();
		int rev=0,rem;
		int n =num;
		while(num != 0) {
			rem =num%10;
			rev =rev/10;
			num = num/10;
		}
if(n == rev) 
	System.out.println(n +"is palindrome");
	else 
		System.out.println(n + "is not palindrome");
}

}
