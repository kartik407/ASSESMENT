package labour;

public class SalariedWorker extends Worker{
	int rate;

	public SalariedWorker(int rate, String name, String type) {
		super();
		this.rate = pay(rate);
	}

	private int pay(int a) {
		
		return a*40;
	}

	

	@Override
	public String toString() {
		return "SalariedWorker [Salary=" + rate + ", name=" + name +  ", type=" + type + "]";
	}

	public SalariedWorker() {
		// TODO Auto-generated constructor stub
	}
}
