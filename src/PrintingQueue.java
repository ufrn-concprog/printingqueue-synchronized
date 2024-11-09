package src;

/**
 * Class that manages (by using synchronized methods) the concurrent access to a
 * printing queue shared among multiple threads, each one simulating
 * a printing job.
 * 
 * @author <a href="mailto:everton.cavalcante@ufrn.br">Everton Cavalcante</a>
 */
public class PrintingQueue {
	/** Default constructor */
	public PrintingQueue() { /* Empty */ }

	/** Perform the printing job itself */
	public synchronized void printJob() {
		try {
			// Thread is suspended by a random time interval to
			// simulate the printing job
			int duration = (int) (Math.random() * 5) + 1;
			System.out.print(Thread.currentThread().getName());
			System.out.print(" printing for " + duration + " second(s)\n");
			Thread.sleep(duration * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
