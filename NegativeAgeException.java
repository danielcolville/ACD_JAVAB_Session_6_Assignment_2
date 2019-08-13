package session6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NegativeAgeException extends Exception {
	public NegativeAgeException(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int temp;
		try {
			temp=sc.nextInt();
			if(temp < 0) {
				throw new NegativeAgeException("Age cannot be negative");
			}
		}
		catch(InputMismatchException ex){
			ex.printStackTrace();
			//in case age entered is string, not int
		}
		catch(NegativeAgeException ex) {
			ex.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
