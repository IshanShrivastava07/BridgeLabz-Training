package com.lambdafunction.smartlight;

public class SmartLight {
public static void main(String[] args) {

	Runnable motionRunnable = () -> System.out.println("Lights ON");
	Runnable voicRunnable = () -> System.out.println("Lights ON");
	Runnable nightRunnable = () -> System.out.println("Lights ON");
	
	motionRunnable.run();
	voicRunnable.run();
	nightRunnable.run();
}
}
