//Java program to check whether the character entered by the user is an alphabet or not.
import java.util.Scanner;
public class alphabetornot
{										//class declaration
    public static void main(String[] args)
    {										//main method declaration
        char c;
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter a Character : ");                       //Input character
        c = sc.next().charAt(0);
										//condition for checking characters
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an Alphabet");
		else
			System.out.println(c + " is not an Alphabet");
		sc.close();			                               //closing scanner class(not compulsory, but good practice)
	}                                                                      //end of the main method
}                                   
