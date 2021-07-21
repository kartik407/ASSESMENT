package labour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class WorkerMain {
	public static void main(String[] args) {
		List<Worker> dWorker=new ArrayList<Worker>();
		dWorker.add(new Worker(544,"Rakesh",30,"Day"));
		dWorker.add(new Worker(550,"Shiva",26,"Day"));
		dWorker.add(new Worker(650,"Dhristi",13,"Day"));
		dWorker.add(new Worker(550,"Priyanka",11,"Day"));
		dWorker.add(new Worker(230,"Amar",21,"Day"));
		System.out.println(dWorker);
		
		Collections.sort(dWorker, new Comparator<Worker>() {

			@Override
			public int compare(Worker o1, Worker o2) {
				if(o1.getSalary()*o1.getDay()>o2.getSalary()*o2.getDay())
					return 1;
					else
						return -1;
			
				// TODO Auto-generated method stub
				
			}
			
		});
		System.out.println(dWorker);
	
        int result=Collections.

		
	}

}
