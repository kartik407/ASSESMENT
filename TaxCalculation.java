package taxSlabs;
import java.util.Scanner;
public class TaxCalculation {
public static void main(String[] args) {
	long income=0;
	String gender;
	System.out.println("Input your income pa");
	Scanner sc=new Scanner(System.in);
	income=sc.nextLong();
	System.out.println("Eneter your gender: \n Female press F \n General press G");
	gender=sc.next();
	calculate(income,gender);
	
}

private static void calculate(long income, String gender) {
	int tax=10;
	if(gender=="G")
	{
		if(income>0 && income<=180000) {
		System.out.println("there will be no tax \n Your net income will be "+income);
		}
		else if(income>180000 && income<=500000) {
			long value;
			value=(income/tax)*1;
			System.out.println("there will be tax of "+ tax*1 + " % \n Your net income will be "+(income-value));
		}
		else if(income>500000 && income<=800000) {
			long value;
			value=(income/tax)*2;
			System.out.println("there will be tax of "+ tax*2 + " % \n Your net income will be "+(income-value));
		}
		else
		{
			long value;
			value=(income/tax)*3;
			System.out.println("there will be tax of "+ tax*3 + " % \n Your net income will be "+(income-value));
	
			
		}
	}
		else
		{
			if(income>0 && income<=190000) {
				System.out.println("there will be no tax \n Your net income will be "+income);
				}
				else if(income>190000 && income<=500000) {
					long value;
					value=(income/tax)*1;
					System.out.println("there will be tax of "+ tax*1 + " % \n Your net income will be "+(income-value));
				}
				else if(income>500000 && income<=800000) {
					long value;
					tax=10;
					value=(income/tax)*2;
					tax=tax*2;
					income=income-value;
					System.out.println("there will be tax of "+ tax*2 + " % \n Your net income will be "+(income-value));
				}
				else
				{
					long value;
					value=(income/tax)*3;	
					System.out.println("there will be tax of "+ tax*3 + " % \n Your net income will be "+(income-value));
			
					
				}
			}
			
		}
	
	
	// TODO Auto-generated method stub
	
}

