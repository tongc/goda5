package com.goda5.hagendaz.common.util.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactoryTest {
	class Car {
		private List<Wheel> wheels = new ArrayList<Wheel>();
		
		public void addWheel(Wheel wheel) {
			if(wheels.size()>=4) {
				throw new UnsupportedOperationException();
			} else {
				wheels.add(wheel);
			}
		}
		
		public List<Wheel> getWheels() {
			return Collections.unmodifiableList(wheels);
		}
	}
	
	class Wheel {
		
	}
	
	class WheelFactory {
		public Wheel makeWheel() {
			return new Wheel();
		}
	}
	
	@Test(expectedExceptions={UnsupportedOperationException.class})
	public void testFactory() {
		WheelFactory factory = new WheelFactory();
		Car car = new Car();
		car.addWheel(factory.makeWheel());
		car.addWheel(factory.makeWheel());
		car.addWheel(factory.makeWheel());
		car.addWheel(factory.makeWheel());
		Assert.assertEquals(car.getWheels().size(), 4);
		car.addWheel(factory.makeWheel());
	}
}
