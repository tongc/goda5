package com.goda5.hagendaz.common.effectivejava;

import org.testng.annotations.Test;

class Cars {
	//3. can init from subclass
	public static Car buildXC90() {
		return new XC90("ES");
	}
}

class Car {
	
}

class Volvo extends Car {
	
}

class XC90 extends Volvo {
	private String model;
	private static XC90 seLux;
	
	public XC90(String model) {
		this.model = model;
	}
	public XC90(String model, boolean xenonLight, boolean gps, boolean frontParkingSensor) {
		
	}
	//1. static factory has a name
	public static XC90 executive() {
		XC90 xc90 = new XC90("executive");
		return xc90;
	}
	
	//2. re-use the object created earlier
	public static XC90 seLux() {
		if(seLux == null) {
			seLux = new XC90("SE Lux");
		}
		return seLux;
	}
	
	//4. reduce verbosity of constructor parameter list
	public static XC90 rDesign() {
		XC90 xc90 = new XC90("rDesign", false, true, true);
		return xc90;
	}
}

@Test
public class StaticFactoryMethod {

}
