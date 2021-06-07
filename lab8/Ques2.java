package lab8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques2 implements Runnable{
	
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Current time is: ");
		int testcases=10;
		while(testcases>0) {
			try {
				display();
				Thread.sleep(10000);
				System.out.print("After 10 secs : ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			testcases-=1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques2 threadtimer=new Ques2();
		Thread thread=new Thread(threadtimer);
		thread.start();
	}
}