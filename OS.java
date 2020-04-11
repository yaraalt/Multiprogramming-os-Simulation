import java.util.LinkedList;
import java.util.Queue;

public class OS {
	double num; 
	int Interrupt;
	double countNormally;
	double countAbNormally;
	boolean check = true;
	double hdsize = 2E9;
	double ramsize = 192E6;
	CPU cpu;
	Queue<PCB> ready = new LinkedList<>();
	Queue<Job> jobs = new LinkedList<>();

	public Queue<Job> JobScheduler(Job j) {
		jobs.add(j);
		return jobs;
	}

	public Queue<Job> CPUScheduler() {
//		jobs.add(j);
		return jobs;
	}

	public boolean GenerateInterrupt() {
		num = Math.random()* 100;
		if(num > 0 && num <= 100) {
			Interrupt++;
			return true;
		}
		return false;
	}

	public boolean terminatesNormally() {
		num = Math.random()* 100;
		if(num> 0 && num <= 0.10) {
			Interrupt++;
			return true;
		}
		return false;
	}

	public boolean termiantesAbnormally() { 
		num = Math.random()* 100;
		if(num> 0 && num <= 0.5) {
			Interrupt++;
			return true; 
		}
		return false; 
	}
}
