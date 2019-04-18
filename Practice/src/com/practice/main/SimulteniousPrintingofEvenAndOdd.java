package com.practice.main;

public class SimulteniousPrintingofEvenAndOdd {
	boolean oddLock;
	int count = 1;
	int maxCount = 20;

	public void printOdd() {
		synchronized (this) {
			while (count < maxCount) {
				if (this.oddLock) {
					try {
						System.out.println("odd lock" + count);
						wait();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				this.count++;
				this.oddLock = false;
				notify();
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (count < maxCount) {
				if (!this.oddLock) {
					try {
						System.out.println("odd lock" + count);
						wait();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				this.count++;
				this.oddLock = false;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		SimulteniousPrintingofEvenAndOdd sv = new SimulteniousPrintingofEvenAndOdd();
		sv.oddLock = false;
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				sv.printEven();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				sv.printOdd();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
