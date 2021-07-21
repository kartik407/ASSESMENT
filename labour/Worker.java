package labour;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

 
public class Worker {

		String name;
		int salary;
		String type;

	public Worker(String name, int salary, String type) {
			super();
			this.name = name;
			this.salary = salary;
			this.type = type;
		}

	public Worker() {
		
	}
	public static void main(String[] args) {
		
		List <DailyWorker> workers = 	new ArrayList<DailyWorker>();
		workers.add(new DailyWorker(349,"Tom","D"));
		workers.add(new DailyWorker(1000,"Sam","D"));
		workers.add(new DailyWorker(89,"Tim","D"));
		
		
		Collections.sort(workers, new Comparator<DailyWorker>() {
						
			public int compare(DailyWorker o1, DailyWorker o2) {
				if(o1.rate >o2.rate)
						return 1;
				else
					return -1;
			}
		});
		Iterator<DailyWorker> iterator = workers.iterator();			
		while(iterator.hasNext()) {
			DailyWorker temp = iterator.next();
			System.out.println(temp);
		}
		System.out.println("\n");

		List <SalariedWorker> w2 = 	new ArrayList<SalariedWorker>();
		workers.add(new DailyWorker(3429,"Bob","D"));
		workers.add(new DailyWorker(1000,"Sam","D"));
		workers.add(new DailyWorker(89,"Tom","D"));
		
		Collections.sort(w2, new Comparator<SalariedWorker>() {
			
			public int compare(SalariedWorker o1, SalariedWorker o2) {
				if(o1.rate >o2.rate)
						return 1;
				else
					return -1;
			}
		});
		Iterator<SalariedWorker> iterato = w2.iterator();			
		while(iterato.hasNext()) {
			SalariedWorker temp = iterato.next();
			System.out.println(temp);
		}
		System.out.println("\n");	}

}