
public class Job {
	public int jID;
	public int ECU;

	public Job(int id, int ecu) { 
		jID= id;
		ECU= ecu; 
	} 


	@Override
	public String toString() { 
		String str= jID + " " + ECU;
		return str; 
	}

}
