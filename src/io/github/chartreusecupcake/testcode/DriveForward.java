package io.github.chartreusecupcake.testcode;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class DriveForward {
	public static void main(String[] args){
		RegulatedMotor left=new EV3LargeRegulatedMotor(MotorPort.C);
		RegulatedMotor right=new EV3LargeRegulatedMotor(MotorPort.B);
		while(true){
			left.forward();
			right.forward();
		}
	}
}
