package com.exercises.multiTreading;

/**
 * Test multiTreading here
 * 
 * @author Azbe
 *
 */
class MyThread extends Thread {
	private String mName;
	private long mTimeInterval;

	public MyThread(String aName, long aTimeInterval) {
		mName = aName;
		mTimeInterval = aTimeInterval;
	}

	public void run() {
		try {
			while (!isInterrupted()) {
				System.out.println(mName);
				sleep(mTimeInterval);
			}
		} catch (InterruptedException intEx) {
			// Current thread interrupted by another thread
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("thread 1", 1000);
		MyThread thread2 = new MyThread("thread 2", 2000);
		MyThread thread3 = new MyThread("thread 3", 1500);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}