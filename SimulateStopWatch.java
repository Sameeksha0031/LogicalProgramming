import java.util.Scanner;

public class SimulateStopWatch {
	
    static long startTime;
    static long stopTime;
    static long elapsedTime;
	
	//to start timer
	public void start()
	{
		startTime=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
	}
	
	// to stop timer
	public void stop()
	{
		stopTime=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTime);
	}
	
	public long getElapsedTime()
	{
		elapsedTime = stopTime - startTime;
		return elapsedTime;
	}
	
	public static void main(String[] args) 
	{
		SimulateStopWatch sw=new SimulateStopWatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
		sc.nextInt();
		sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		sc.nextInt();
		sw.stop();

		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}
