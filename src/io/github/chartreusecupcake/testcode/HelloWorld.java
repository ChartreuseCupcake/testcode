package io.github.chartreusecupcake.testcode;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

public class HelloWorld {
	public static void main(String[] args){
		LCD.drawString("hello world", 4, 4);
		Button.waitForAnyPress();
	}
}
