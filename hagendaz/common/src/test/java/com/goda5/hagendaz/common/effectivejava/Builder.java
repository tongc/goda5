package com.goda5.hagendaz.common.effectivejava;

import org.testng.Assert;
import org.testng.annotations.Test;

class XC901 {
	boolean xenonLight;
	boolean frontParkingSensor;
	boolean spareWheel;
	
	static class Builder {
		XC901 xc90;
		public Builder() {
			xc90 = new XC901();
		}
		
		public Builder xenonLight(boolean xenonLight) {
			xc90.xenonLight = xenonLight;
			return this;
		}
		
		public Builder frontParkingSensor(boolean frontParkingSensor) {
			xc90.frontParkingSensor = frontParkingSensor;
			return this;
		}
		
		public Builder spareWheel(boolean spareWheel) {
			xc90.spareWheel = spareWheel;
			return this;
		}
		
		public XC901 build() {
			return xc90;
		}
	}
}

@Test
public class Builder {
	public void buildXC90() {
		XC901 xc90 = new XC901.Builder().frontParkingSensor(true).xenonLight(true).spareWheel(false).build();
		XC901 xc901 = new XC901.Builder().frontParkingSensor(true).xenonLight(true).spareWheel(false).build();
		Assert.assertNotEquals(xc90, xc901);
	}
}
