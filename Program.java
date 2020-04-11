import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

	public Queue<Job> jobs;	
	public int count;	

	public Program() { 
		jobs = new LinkedList<Job>();
		count = 0; 
	}

	public Job generateJob() { 
		int id = count++;
		int ecu = (int)(Math.random()*512);

		while(ecu < 16)
			ecu = (int)(Math.random()*512);

		Job obj = new Job(id, ecu);
		return obj; 
	}



	public void generateInput() { 
		File f = new File("input.txt");
		FileOutputStream fOut;
		PrintWriter writer;
		try { 
			fOut = new FileOutputStream(f);
			writer = new PrintWriter(fOut);  

			Job obj;
			for(int i = 0; i < 10; i++) { 
				obj = generateJob();
				writer.println(obj.jID + "\t" + obj.ECU + "\n"); } 

			writer.close();
			fOut.close(); 
		} catch (Exception e) { 
			e.getMessage(); 
		} 
	} 



	public void fillJQueue() { 
		File f= new File("input.txt");
		Scanner input;
		try { 
			input= new Scanner(f);

			Job obj;
			int id;
			int ecu;
			while(input.hasNext()) { 
				id= input.nextInt();
				ecu= input.nextInt();
				obj= new Job(id, ecu);

				jobs.add(obj); 
			} 

			input.close(); 
		}
		catch (Exception e) { 
			e.getMessage(); 
		} 
	} 
}

