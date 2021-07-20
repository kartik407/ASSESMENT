package nEggs;
import java.util.Scanner;

public class DisplayEggs {
	public static void main(String[] args) {
		int noOfeggs;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Eggs ");
		 noOfeggs = sc.nextInt();
		int gross = noOfeggs/144;
		int dozen = (noOfeggs%144)/12;
		int remainingEggs = (noOfeggs%144)%12;
		System.out.println("Your number of eggss "+ gross +" gross "+ dozen+" dozen, and "+remainingEggs );
	}
	

}
