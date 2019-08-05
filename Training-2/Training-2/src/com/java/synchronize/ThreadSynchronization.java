package com.java.synchronize;

class GenerateNumberTask implements Runnable {
	private int MAX;
	private boolean isEven;
	private PrintNumber print;

	public GenerateNumberTask(int MAX, boolean isEven, PrintNumber print) {
		this.MAX = MAX;
		this.isEven = isEven;
		this.print = print;
	}

	@Override
	public void run() {

		int number = isEven ? 2 : 1;
		while (number <= MAX) {
			// Delay of 1 second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (isEven) {
				// Print Even
				print.printEven(number);
			} else {
				// Print Odd
				print.printOdd(number);
			}

			// Delay of 1 second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Increment NUMBER
			number = number + 2;
		}

	}

}

class PrintNumber {
	// Default value --> FALSE
	private volatile boolean isOdd;

	// Thread-Safe --> printOdd
	void printOdd(int number) {
		synchronized (this) {
			while (isOdd) {
				try {
					wait();// Sends the current thread to waiting state --> Release the lock before making
							// transition into waiting state
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + ":" + number);
			isOdd = true;
			notify();
		}
	}

	// Thread-Safe --> printEven
	synchronized void printEven(int number) {
		while (!isOdd) {
			try {
				wait();// Sends current thread to the waiting state --> Release the lock before making
						// transition into waiting state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + ":" + number);
		isOdd = false;
		notify();
	}
}

/*MAIN CLASS*/
public class ThreadSynchronization {
	public static void main(String[] args) {

		PrintNumber print = new PrintNumber();

		Thread threadOdd = new Thread(new GenerateNumberTask(10, false, print), "Odd");
		Thread threadEven = new Thread(new GenerateNumberTask(10, true, print), "Even");

		threadOdd.start();
		threadEven.start();

	}
}
