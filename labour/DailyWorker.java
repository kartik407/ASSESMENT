package labour;


public class DailyWorker extends Worker {
	
	int rate;
	
	public DailyWorker(int rate,String name, String type) {
		super();
		this.name=name;
		this.type="Daily Wage";
		this.rate = pay(rate);
	}

	

	@Override
	public String toString() {
		return " [Salary=" + rate + ", name= " + name  + "type = " + type + "]";
	}



	private int pay(int rate) {
		// TODO Auto-generated method stub
		return rate*7;
	}

	public DailyWorker() {
		// TODO Auto-generated constructor stub
	}
}