
public class PCB {
	int pid, cut, ecu;
	State state;
	
	public PCB(int pid, int ecu) {
		this.pid = pid;
		this.ecu = ecu;
		state = State.New;
	}
	
	public void admit() {
		state = State.Ready;
	}
	
	public void waiting() {
		state = State.Waiting;
	}
	
	public void run() {
		state = State.Running;
	}
	
	public void terminate() {
		state = State.Terminated;
	}
}




